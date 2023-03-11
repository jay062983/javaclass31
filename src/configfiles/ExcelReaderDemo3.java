package configfiles;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String>row1=new LinkedHashMap<>();
        row1.put("name","Andrew");
        row1.put("age","35");
        row1.put("City","NewYork");
        row1.put("Salary","250000");


        LinkedHashMap<String,String>row2=new LinkedHashMap<>();
        row2.put("name","drew");
        row2.put("age","34");
        row2.put("City","NewYork");
        row2.put("Salary","25000");

        LinkedHashMap<String,String>row3=new LinkedHashMap<>();
        row3.put("name","Kain");
        row3.put("age","32");
        row3.put("City","NewYork");
        row3.put("Salary","450000");

        List<Map<String,String>>allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);
    }
}
