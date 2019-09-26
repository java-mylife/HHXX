package com.baidu.server;

import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Api(value = "/",description = "这是我的get方法")
@RestController
public class MyGetMethod {

    @ApiOperation(value = "通过这个方法可以获取到Cookies",httpMethod = "GET")
    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    public String getcookies(HttpServletResponse response) {
        Cookie cookie = new Cookie("lonin", "hahah");
        response.addCookie(cookie);
        return "恭喜你获得cookies信息成功";
    }

    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */

    @ApiOperation(value = "请求这个需要携带cookies",httpMethod = "GET")
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getwithCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();

        if (Objects.isNull(cookies)) {
            return "你必须要携带上cookies";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") &&
                    cookie.getValue().equals("hahah")) {
                return "携带cookies来成功了";
            }
        }
        return "你必须要携带上cookies";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求。
     * 第一种实现方式 url: key=value&key=value
     * 我们来模拟获取商品列表
     */


    @ApiOperation(value = "待参数的get",httpMethod = "GET")
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    public Map<String,Integer>getlist(@RequestParam Integer start,
                                        @RequestParam Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("云烟",10);
        mylist.put("小苏",22);
        mylist.put("大前门",5);
        return mylist;
    }

    @ApiOperation(value = "待参数的get2222",httpMethod = "GET")
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    public Map<String,Integer>getll(){
        Map<String,Integer>mylist = new HashMap<>();
        mylist.put("云烟",10);
        mylist.put("小苏",22);
        mylist.put("大前门",5);
        return mylist;    }


}
