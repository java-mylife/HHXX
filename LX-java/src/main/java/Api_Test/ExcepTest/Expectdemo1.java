package Api_Test.ExcepTest;

import java.io.*;
import java.util.Properties;

public class Expectdemo1 {
    public static void expect1(String file) {

        File file1 = new File(file);
        InputStream inputStream = null ;
        try {
            inputStream = new FileInputStream(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
