package JDBC.day01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {
    Connection connection;
    Statement statement;
    @BeforeTest
    public void DBConnectionCreate(){
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void DBConnectionClose(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        rs.next();
        String language = rs.getString("name");
        System.out.println("language: "+language);
        rs.next();
        language = rs.getString("name");
        System.out.println("language: "+language);
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        rs.next();
        String language = rs.getString("name");
        System.out.println("language from 1st row: "+language);
        rs.next();
        language = rs.getString("name");
        System.out.println("language from 2nd row: "+language);

        rs.previous(); // moves to the previous row
        language = rs.getString("name");
        System.out.println("language from 1st: "+language);
    }
}