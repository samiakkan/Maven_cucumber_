package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_GetAllDataInARow {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(1);

        for (int i = 0; i < 4; i++) {
            System.out.println(row.getCell(i));

        }
    }
}
