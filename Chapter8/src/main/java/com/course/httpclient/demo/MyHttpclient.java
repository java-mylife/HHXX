package com.course.httpclient.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
//import org.testng.annotations.Test;

public class MyHttpclient {


    @Test
    public void test01() throws Exception {

        String result; //存放结果
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://www.baidu.com/");
        CloseableHttpResponse response = httpclient.execute(httpget);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        try {
            System.out.println(response);
        } catch (Exception e) {

        } finally {
            response.close();
        }
    }

}

