package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String getCellValue(String sheetName, int rowIndex, int columnIndex) throws IOException {


        File f = new File("src/main/resources/data/SampleTestDataSheet.xlsx");
        FileInputStream fis = new FileInputStream(f);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String value = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        return value;
    }
}
