package configfiles;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\jaycs\\Downloads\\poi-bin-5.2.3-20220909\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= (Sheet) xssfWorkbook.getSheet("sheet1");

    }
}
