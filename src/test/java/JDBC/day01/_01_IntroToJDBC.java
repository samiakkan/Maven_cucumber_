package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_IntroToJDBC {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server,
        // port number on that server, name of the database we want to work on

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z"; // '"-LhCB'.%k[4S]z

        Connection connection = DriverManager.getConnection(url,username,password); // Created a connection to the database
        Statement statement = connection.createStatement(); // Created a statement to write our queries
        ResultSet rs = statement.executeQuery("select * from actor"); // Result is ready but not on our pc
        // The result is on the database to work faster

        // rs.next -> moves one by one from one row to the next row

        rs.next(); // the arrow is on the first row
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1st row first and last names: "+firstName+" "+lastName);

        rs.next(); // moved to the second row
        firstName = rs.getString(2); // in db index starts from 1
        lastName = rs.getString(3);
        System.out.println("2nd row first and last names: "+firstName+" "+lastName);
        connection.close(); // connection is closed
    }
}
