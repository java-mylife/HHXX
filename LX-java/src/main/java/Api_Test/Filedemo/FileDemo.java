package Api_Test.Filedemo;

import java.io.*;
import java.util.Properties;

public class FileDemo {
    public static  void filedemo(String path) throws IOException {
        File file = new File(path);
        System.out.println(file.exists());   //判断路径是否正确；
        InputStream inputStream = new FileInputStream(path); //创建文件流对象 接收文件
        Properties properties = new Properties();  //properties 对象
        properties.load(inputStream); //加载流文件；
        System.out.println(properties.getProperty("log4j.rootLogger"));//根据key 获取values；
    }

    /***
     * 复制 cope文件
     * @throws IOException
     */
    public static void filedemo1() throws IOException {
        String path = "/Users/wangshiyu/git11/HHXX/LX-java/src/main/resources/koobe.jpeg";
        String path1 ="/Users/wangshiyu/git11/HHXX/LX-java/src/main/resources/koobe1.jpeg";
        File file = new File(path);
        System.out.println(file.exists());
        InputStream inputStream = new FileInputStream(path);
        OutputStream outputStream = new FileOutputStream(path1);
        int size = 0;
        while ((size = inputStream.read()) !=-1){   //读到文件size为-1 为读完，
            System.out.println(size);
            outputStream.write(size); //写 size这么大的文件；
        }
        if (inputStream!=null){
            inputStream.close();
        }
        if (outputStream != null){
            outputStream.close();
        }
        System.out.println("完成");
    }
    public static void filedemo2(String path) throws IOException {
        File file = new File(path);
        file.exists();
        file.isFile();
        InputStream inputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("log4j.rootLogger"));

    }
    public static void main(String[] args) throws Exception {
//        filedemo("/Users/wangshiyu/git11/HHXX/LX-java/src/main/resources/log4j.properties");
//        filedemo1();
        String path = "/Users/wangshiyu/git11/HHXX/LX-java/src/main/resources/log4j.properties";
        filedemo2(path);

    }
}
