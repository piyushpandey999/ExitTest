package Utilities;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExeclData {

    XSSFWorkbook wb;
    XSSFSheet sheet1;
    Map<String, String> data = new HashMap<>();

    public ReadExeclData(String excelPath) {
        try {
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<String, String> getData() {
        sheet1 = wb.getSheetAt(0);
        int row = sheet1.getLastRowNum();

        for (int r = 1; r <= row; r++) {
            XSSFRow row1 = sheet1.getRow(r);

            XSSFCell cell = row1.getCell(0);
            String username = cell.getStringCellValue();

            cell = row1.getCell(1);
            String password = cell.getStringCellValue();

            data.put(username, password);
        }
        return data;
    }
}

