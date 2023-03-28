package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _06_GetASpecificData {
    /**
     * Write the code that gives specific data the user wants
     * E.g. When user types username print the username from the excel file
     * */

    public static void main(String[] args) throws IOException {

        System.out.println("What do you want to search?");
        Scanner scanner = new Scanner(System.in);
        String usersResponse = scanner.nextLine();
        System.out.println(search(usersResponse));

    }

    public static String search(String searchKeyWord) throws IOException {
        String returnString = "";
        String path = "src/test/java/ApachePOI/Resources/LoginData.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchKeyWord)){
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnString += sheet.getRow(i).getCell(j)+" ";
                }
            }
        }
        return returnString;
    }

}