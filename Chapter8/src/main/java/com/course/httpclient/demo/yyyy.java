package com.course.httpclient.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class yyyy {
    @Test
    public void test01() throws Exception {
        String res ;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://wwww.baidu.com");
        CloseableHttpResponse response =httpClient .execute(httpGet);
        res = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(res);
        try{
            System.out.println(response);
        }catch (Exception e ){

        }finally {
            response.close();
        }
    }
}
