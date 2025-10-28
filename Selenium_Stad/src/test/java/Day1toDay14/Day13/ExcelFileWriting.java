package Day1toDay14.Day13;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {

    public static void main(String[] args) throws IOException {
        // Create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a sheet
        XSSFSheet sheet = workbook.createSheet("TestData");

       XSSFRow row1 = sheet.createRow(0);
       row1.createCell(0).setCellValue("Priyanka");
       row1.createCell(1).setCellValue("Chaudhari");
       row1.createCell(2).setCellValue("Software Tester");

        XSSFRow row2 = sheet.createRow(0);
        row2.createCell(0).setCellValue("Kapil");
        row2.createCell(1).setCellValue("Chaudhari");
        row2.createCell(2).setCellValue("Electrical Engineer");

        XSSFRow row3 = sheet.createRow(0);
        row3.createCell(0).setCellValue("Jitendra");
        row3.createCell(1).setCellValue("Chaudhari");
        row3.createCell(2).setCellValue("Software Developer");

        // Write to file
        String filePath = "C:\\STAD Solutions\\Practice\\Selenium_Stad\\Excel file programs\\file reading.xlsx";
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        // Close resources
        fos.close();
        workbook.close();

        System.out.println("Excel file written successfully at: " + filePath);
    }
}
