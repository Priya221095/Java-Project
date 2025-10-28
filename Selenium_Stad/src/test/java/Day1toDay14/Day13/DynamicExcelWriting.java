package Day1toDay14.Day13;

import java.io.FileOutputStream;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicExcelWriting {

    public static void main(String[] args) throws Exception {

        // Create Excel file output stream (path will be created in project folder)
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Excel file programs\\file reading.xlsx");

        // Create new blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create new sheet with name "DynamicData"
        Sheet sheet = workbook.createSheet("DynamicData");

        // Take user input for rows and columns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want: ");
        int totalRows = sc.nextInt();

        System.out.print("Enter number of columns you want: ");
        int totalCols = sc.nextInt();

        // Loop to create rows and cells dynamically
        for (int r = 0; r < totalRows; r++) {
            Row row = sheet.createRow(r);
            for (int c = 0; c < totalCols; c++) {
                Cell cell = row.createCell(c);
                cell.setCellValue("Row" + (r + 1) + "_Col" + (c + 1)); // Sample data
            }
        }

        // Write workbook to file
        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("Excel File Created Successfully at: " + System.getProperty("user.dir") + "Excel file programs\\file reading.xlsx");
    }
}
