package com.baidu.server;

import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getcookies(HttpServletResponse response){
        Cookie cookie = new Cookie("lonin","hahah");
        response.addCookie(cookie);
        return "恭喜你获得cookies信息成功";
    }

    public String getwithCookies(HttpServletRequest request){

    }

}
