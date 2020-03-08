package com.course.httpclient.demo;

import com.sun.deploy.net.HttpUtils;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.http.HttpException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.log4j.Logger;
import org.apache.commons.lang.StringUtils;
import java.io.IOException;


public class MyHttpClient {
    private final static String UTF8 = "UTF-8";

    private HttpClient client;
//    public static CloseableHttpClient httpClient;
    public static MyHttpClient instance = new MyHttpClient();
    public static Object res = null;
    private final static Logger logger = Logger.getLogger(MyHttpClient.class);
    private final static String OPERATER_NAME = "【http操作】";
    private final static String token = "123";
    private final static int SUCCESS = 200;





    //构造函数----// 私有化构造器
    private MyHttpClient(){
        HttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager();
        HttpConnectionManagerParams params = httpConnectionManager.getParams();
        params.setConnectionTimeout(5000);
        params.setSoTimeout(20000);
        params.setDefaultMaxConnectionsPerHost(1000);
        params.setMaxTotalConnections(1000);
        client = new HttpClient(httpConnectionManager);
        client.getParams().setContentCharset(UTF8);
        client.getParams().setHttpElementCharset(UTF8);
//        httpClient = new DefaultHttpClient();

    }

    //get 请求方法封装  返回私有的 doget 方法
    public Object get(String url) throws IOException {
        return instance.doGet(url);
    }

    private Object doGet(String url) throws IOException {
        HttpMethod method = new GetMethod(url.toString());
        client.executeMethod(method);
        res = method.getResponseBodyAsString();
        int code = method.getStatusCode();
        System.out.println(code);
        System.out.println(res);
        return res;
    }

    public String get1(String url){
        return instance.DoGet(url);
    }
    private String DoGet(String url){
        long begintime = System.currentTimeMillis();
        String res = StringUtils.EMPTY;
        try {
            logger.info(OPERATER_NAME+"开始get通信，目标host:"+url);
            HttpMethod httpMethod = new GetMethod(url);
            httpMethod.addRequestHeader("token",token);
            httpMethod.getParams().setContentCharset(UTF8);
            httpMethod.setRequestHeader("Accept-Language","zh-cn,zh;q=0.5");
            try{
                client.executeMethod(httpMethod);
            } catch (IOException e ){
                logger.error(new StringBuffer("发送HTTP GET给\r\n").append(url).append("\r\nIO异常\r\n"), e);

            }
            if (httpMethod.getStatusCode() == SUCCESS) {
                try {
                    res = httpMethod.getResponseBodyAsString();
                    logger.info("token=" + httpMethod.getRequestHeader("token").toString());
//                    logger.info("refreshToken="+method.getRequestHeader("refreshToken").toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                logger.error("请求报错");
                return null;
            }

            httpMethod.releaseConnection();

            logger.info(OPERATER_NAME + "通讯完成，返回码：" + httpMethod.getStatusCode());
            logger.info(OPERATER_NAME + "返回内容：" + httpMethod.getResponseBodyAsString());
            logger.info(OPERATER_NAME + "结束..返回结果:" + res);
        } catch (Exception e) {
            logger.info(OPERATER_NAME, e);
        }
        long endTime = System.currentTimeMillis();
        logger.info(OPERATER_NAME + "共计耗时:" + (endTime - begintime) + "ms");

        return res;



        }


    public static void main(String[] args) {
        MyHttpClient.instance.get1("http://wwww.baidu.com");
    }

}



