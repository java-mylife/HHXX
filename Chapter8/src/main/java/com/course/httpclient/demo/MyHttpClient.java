package com.course.httpclient.demo;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.oracle.jrockit.jfr.DataType.UTF8;

public class MyHttpClient {
    private final static String UTF8 = "UTF-8";

    private HttpClient client;
    public static CloseableHttpClient httpClient;
    public static MyHttpClient instance = new MyHttpClient();
    public static Object res = null;



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


    public static void main(String[] args) throws IOException {
        MyHttpClient.instance.get("http://wwww.baidu.com/");
    }
}