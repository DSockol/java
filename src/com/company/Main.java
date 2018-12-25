package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
public class Main {

    public static void main(String[] args)throws SQLException, ClassNotFoundException {
	    String userName = "root";
	    String password = "root";
	    //String connectionUrl = "jdbc:mysql://localhost:3306/zachet";
		String connectionUrl = "jdbc:mysql://localhost/zachet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    Class.forName("com.mysql.jdbc.Driver");
	    try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
            System.out.println("We're connected");
        }
    }
}
