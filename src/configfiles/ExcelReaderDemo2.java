package configfiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/MyXlfile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("sheet1");
        /* getPhysicalNumberOfRows()
        * it return the no of rows that actually contain the data in  excel files*/
        int noOfRows=sheet1.getPhysicalNumberOfRows();
        /* we need one loop to go*/
        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet1.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();
        }
}}

