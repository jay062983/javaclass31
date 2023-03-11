package configfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFilesWriteDemo1 {
    public static void main(String[] args) throws IOException {
        /* Path where we want to create the new file and the name of the file with its extension */

        String path="Files/test.properties";
// we use FileOutputStream to write data into a file
       FileOutputStream fileInputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        //we use setAProperty method to store data inside a properties files.
        properties.setProperty("Davin","kevin");
        // A method to write the data to the disk
    properties.store(fileInputStream,"A new name has been added");
    }
}
