package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	DatabasePage databasePage;

	String columnValue;

	Connection connection;
	Statement statement;
	ResultSet resultSet;

	public String getData(String columnName) {

		// setting properties of MySQL.
		// get the JDBC driver from
		// ;https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-driver-name.html

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlurl = "jdbc:mysql://localhost:3306/september2022";
			String sqlusername = "root";
			String sqlpassword = "root1234";
			String sqlquery = "Select*from users";
			// create connection to the local database

			connection = DriverManager.getConnection(sqlurl, sqlusername, sqlpassword);

			// empower connection reference variable to execute queries
			statement = connection.createStatement();

			// Deliver the query
		
			resultSet = statement.executeQuery(sqlquery);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return columnValue;
	}

}
