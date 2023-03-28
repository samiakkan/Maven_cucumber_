package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx"; // path of the file

        FileInputStream fileInputStream = new FileInputStream(path); // connection to the file to read only

        Workbook workbook = WorkbookFactory.create(fileInputStream); // getting the workbook with the connection

        Sheet sheet = workbook.getSheet("Sheet1"); // we got the sheet we want to work on it

        Row row = sheet.getRow(0); // we got the row we want

        Cell cell = row.getCell(0);
        Cell cell1 = row.getCell(1);

        System.out.println(cell);
        System.out.println(cell1);

        Row row1 = sheet.getRow(1);
        Cell cell2 = row1.getCell(2);
        System.out.println(cell2);

    }
}