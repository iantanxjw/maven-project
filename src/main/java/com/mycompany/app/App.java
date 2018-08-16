package com.mycompany.app;

import java.sql.*;
/**
 * Hello world!
 *
 */

public class App
{
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING =
            "jdbc:mysql://localhost/testdb";

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb?useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main( String[] args ) throws SQLException
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try
        {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM customers");

            rs.last();
            System.out.println("Connected");
        }
        catch (SQLException e)
        {
            System.err.println(e);
        }
        finally
        {
            if (rs != null)
            {
                rs.close();
            }

            if (stmt != null)
            {
                stmt.close();
            }

            if (conn != null)
            {
                conn.close();
            }
        }
        System.out.println( "Hello World!" );
    }
}
