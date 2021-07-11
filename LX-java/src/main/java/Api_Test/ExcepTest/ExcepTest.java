package Api_Test.ExcepTest;

import java.io.*;
import java.util.Properties;

public class ExcepTest {
    public static void except(String  file) throws IOException {

        //创建文件吧对象；
        File file1 = new File(file);
        //将文件里面的内容读取到输入流中；
        InputStream inputStream = new FileInputStream(file1);
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("123.txt"));
//        throw new ClassCastException();
    }
    public static void main(String[] args) throws IOException {


        except("/Users/wangshiyu/Desktop/123.txt");
    }}
