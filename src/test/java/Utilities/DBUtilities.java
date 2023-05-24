package Utilities;

import java.sql.*;
import java.util.ArrayList;

public class DBUtilities {
    static Connection connection;
    static Statement statement;

    public static ArrayList<ArrayList<String>> getData(String query) {
        ArrayList<ArrayList<String>> table = new ArrayList<>();
        DBConnectionCreate();
        try {
            ResultSet rs = statement.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                ArrayList<String> innerList = new ArrayList();
                for (int i = 1; i <= columnCount; i++) {
                    innerList.add(rs.getString(i));
                }
                table.add(innerList);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        DBConnectionClose();
        return table;
    }

    public static void DBConnectionCreate() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}