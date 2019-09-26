package com.course.httpclient.cookies;


import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MycookiesForGet {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;

    private HttpClient httpClient;

    @BeforeTest
    public void befortest() {
        bundle = ResourceBundle.getBundle("applacation", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void test() throws IOException {
        String res;
        //拼接url 从配置文件中
        String uri = bundle.getString("getcookies");
        String testurl = this.url + uri;

//        //测试代码逻辑书写
//        HttpGet httpGet = new HttpGet(testurl);
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        CloseableHttpResponse response = httpclient.execute(httpGet);
//        res  = EntityUtils.toString(response.getEntity(),"utf-8");
//        System.out.println(res);


        //获取cookies信息
        this.store = new BasicCookieStore();
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(store).build();
//        CloseableHttpClient httpClient = HttpClients.custom().build();

        //测试逻辑
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(testurl);
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //打印返回值
        res = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(res);

        //读取cookie信息
        List<Cookie> cookieList = this.store.getCookies();
        for (Cookie cookie : cookieList) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = " + name + ";cookie value =" + value);

            int code = response.getStatusLine().getStatusCode();

            System.out.println(cookie);
            System.out.println("coode = " + code);

        }


    }

    @Test(dependsOnMethods = "test")
    public  void test1() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        String testurl2 = this.url+uri;
        String res ;
        HttpGet httpGet = new HttpGet(testurl2);
        CloseableHttpClient client = HttpClients.createDefault();
//        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(store).build();
//        CookieStore cookieStore = new BasicCookieStore();
        CookieStore cookieStore = new BasicCookieStore();

        HttpClientContext context = HttpClientContext.create();
        context.setCookieStore(this.store);

        HttpResponse httpResponse  = client.execute(httpGet);
        res = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(res);


        //设置cookie信息

    }

    @Test(enabled = false)
    public void test3() throws IOException {

        String res;
        CookieStore cookieStore = null;
        httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://wwww.baidu.com");
        HttpResponse response = httpClient.execute(httpGet);
        res = EntityUtils.toString(response.getEntity(),"utf-8");
        cookieStore.addCookie((Cookie) this.store);
        System.out.println(res);

    }



}
