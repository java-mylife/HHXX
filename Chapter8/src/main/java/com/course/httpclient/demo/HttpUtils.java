package com.course.httpclient.demo;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.lang.StringUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.net.URLEncoder;

public class HttpUtils {


    public static String token = "eyJkYXRlIjoxNTcwODYzMTYwNDkwLCJ1aWQiOiJsaXVxaTEyMyIsInR5cCI6IkpXVCIsInRpbWUiOjE1NzA4NjMxNjA0OTAsInV1aWQiOiJmZWYwYmVmNC0wMWNiLTRlMjQtOWVjMS0yNWMzNjZiYzU5NGUiLCJhbGciOiJIUzI1NiJ9eyJuYW1lIjoieXVubmFuemhvbmd5YW4iLCJ0eXBlIjoiand0In0tmNw6y35lBrlLOAHLirEFjlRlut2PRvJvvP6B2RTE";//定义一个放置cookie的map

    public static String refreshToken = "";//定义一个放置cookie的map

    public static String validToken = "eyJkYXRlIjoxNTYzMzUyNDUzMDgzLCJ1aWQiOiJsaXVxaTEyMyIsInR5cCI6IkpXVCIsInRpbWUiOjE1NjMzNTI0NTMwODMsImFsZyI6IkhTMjU2In0eyJuYW1lIjoieXVubmFuemhvbmd5YW4iLCJ0eXBlIjoiand0In0zfkrv4g8iODOe4PB84tQfB0cRPDGqVV9KqeDDubZZw";

    private final static Logger logger = Logger.getLogger(HttpUtils.class);

    private final static String OPERATER_NAME = "【http操作】";

    private final static int SUCCESS = 200;

    private final static String UTF8 = "UTF-8";

    private HttpClient client;

    public static HttpUtils instance = new HttpUtils();

    public static CloseableHttpClient httpClient;

    /**
     * 私有化构造器
     */
    private HttpUtils() {
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

    /**
     * 解决url中包含中文以及特殊字符的问题
     *
     * @param param
     * @return
     * @throws Exception
     */
    public String getEncode(String param) throws Exception {
        return URLEncoder.encode(param, "UTF-8");
    }


    /**
     * get请求
     *
     * @param url
     * @return
     */
    public String get(String url) {
        return instance.doGet(url);
    }

    private String doGet(String url) {
        long beginTime = System.currentTimeMillis();
        String respStr = StringUtils.EMPTY;
        try {
            logger.info(OPERATER_NAME + "开始get通信，目标host:" + url);

            HttpMethod method = new GetMethod(url.toString());
            method.addRequestHeader("token", token);

//            method.addRequestHeader("refreshToken",refreshToken);
            method.getParams().setContentCharset(UTF8);
            method.setRequestHeader("Accept-Language", "zh-cn,zh;q=0.5");
            try {
                client.executeMethod(method);
            } catch (HttpException e) {
                logger.error(new StringBuffer("发送HTTP GET给\r\n").append(url).append("\r\nHTTP异常\r\n"), e);
            } catch (IOException e) {
                logger.error(new StringBuffer("发送HTTP GET给\r\n").append(url).append("\r\nIO异常\r\n"), e);
            }

            if (method.getStatusCode() == SUCCESS) {
                try {
                    respStr = method.getResponseBodyAsString();
                    logger.info("token=" + method.getRequestHeader("token").toString());
//                    logger.info("refreshToken="+method.getRequestHeader("refreshToken").toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                logger.error("请求报错");
                return null;
            }

            method.releaseConnection();

            logger.info(OPERATER_NAME + "通讯完成，返回码：" + method.getStatusCode());
            logger.info(OPERATER_NAME + "返回内容：" + method.getResponseBodyAsString());
            logger.info(OPERATER_NAME + "结束..返回结果:" + respStr);
        } catch (Exception e) {
            logger.info(OPERATER_NAME, e);
        }
        long endTime = System.currentTimeMillis();
        logger.info(OPERATER_NAME + "共计耗时:" + (endTime - beginTime) + "ms");

        return respStr;
    }

    public static void main(String[] args) {
        HttpUtils.instance.get("http://baidu.com");
    }
}
