package org.example.jdbc;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/college?" + "User=root&password=admin"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager.getConnection(connectionString);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from college.courses");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int units = resultSet.getInt("units");

                System.out.println("Course ID: " + id + " is " + name + " and has " + units + units);
            }
        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
