package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInDifferentRow {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";
        Sheet sheet;
        Workbook workbook;
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet("Sheet1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int rowCount = sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(rowCount);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello World");

        for (int i = 1; i < 10; i++) {
            row.createCell(i).setCellValue(i);
        }

        FileOutputStream outputStream;
        try {
            inputStream.close();
            outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}