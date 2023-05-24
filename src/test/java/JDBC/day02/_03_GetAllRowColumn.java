package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends JDBCConnection {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); // stores the names, types and number of colums

        int columnCount = rsmd.getColumnCount(); // gives the number of columns
        System.out.println(columnCount);

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i); // gives column name
            System.out.println(columnName);

            String columnType = rsmd.getColumnTypeName(i); // gives column type name
            System.out.println(columnType);
        }
    }

    @Test
    public void test2() throws SQLException {

        // Print all rows on the language table as they are shown in a mysql result
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
            System.out.print(rsmd.getColumnName(i)+"\t\t");
        }
        System.out.println();

//        while(rs.next()) {
//            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//                System.out.print(rs.getString(i) + "\t\t\t\t");
//            }
//            System.out.println();
//        }

        rs.last();
        int rowCount = rs.getRow();

        for (int i = 1; i <= rowCount ; i++) {
            rs.absolute(i);
            for (int j = 1; j <= rsmd.getColumnCount(); j++) {
                System.out.print(rs.getString(j) + "\t\t\t\t");
            }
            System.out.println();
        }

    }

}