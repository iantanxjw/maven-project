package com.mycompany.app;

import java.sql.*;
/**
 * Hello world!
 *
 */

public class App
{
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb?useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
