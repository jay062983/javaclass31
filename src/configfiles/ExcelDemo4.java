package configfiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path="Files/MyXlfile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("sheet1");
        int noOfRows=sheet1.getPhysicalNumberOfRows();
       // List<Map<String,String>>excelData=new ArrayList<>();
        var excelData=new ArrayList<>();
        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet1.getRow(i);
          LinkedHashMap rowMap=new LinkedHashMap<>();
          rowMap.put("Name",row.getCell(0));
            rowMap.put("Age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("Salary",row.getCell(3));
            excelData.add(rowMap);



            }
            System.out.println();
        }
    }


