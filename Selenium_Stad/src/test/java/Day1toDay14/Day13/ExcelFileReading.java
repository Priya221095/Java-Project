package Day1toDay14.Day13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {

    public static void main(String[] args) throws IOException {

        // Path of your Excel file
        String filePath = "C:\\STAD Solutions\\Practice\\Selenium_Stad\\Excel file programs\\file reading.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        // Load the workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Load the first sheet (index 0)
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Loop through rows
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);

            // Skip if row is null (blank row in Excel)
            if (row == null) {
                continue;
            }

            // Loop through cells in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                XSSFCell cell = row.getCell(j);

                // Skip null/empty cells
                if (cell == null) {
                    System.out.print("EMPTY\t");
                } else {
                    System.out.print(cell.toString() + "\t");
                }
            }
            System.out.println();
        }

        // Close workbook and stream
        workbook.close();
        fis.close();
    }
}
