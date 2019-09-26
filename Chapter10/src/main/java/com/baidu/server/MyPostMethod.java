package com.baidu.server;

import com.baidu.bean.User;
import com.baidu.bean.User1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/", description = "这是我的post方法")
public class MyPostMethod {


    private static Cookie cookie;   //用来装cookies信息的

    @ApiOperation(value = "登陆接口", httpMethod = "POST")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletResponse response,
                        @RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password) {
        if (username.equals("zhangsan") && password.equals("123456")) {
            cookie = new Cookie("login", "hahah");
            response.addCookie(cookie);
            return "恭喜你登陆成功了";
        }
        return "用户名或秘密错误";

    }


    @RequestMapping(value = "/getuserlist", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getuserlist(HttpServletRequest request,
                              @RequestBody User u) {

        User user;
        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        for (Cookie c : cookies
        ) {
            if (c.getName() == "login" &&
                    c.getValue() == "hahah" &&
                    u.getGetUserName().equals("zhangsan") &&
                    u.getPassword().equals("123456")) {
                user = new User();
                user.setName("lisi");
                user.setAge("12");
                user.setSex("s2222");
                return user.toString();


            }


        }
        return "参数不合法";


    }

    @RequestMapping(value = "/getuserlist1", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getuserlist1(@RequestBody User1 u) {

        User user = null;
        //获取cookies
//        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
//        for (Cookie c : cookies
//        ) {
//            if (c.getName() == "login" &&
//                    c.getValue() == "hahah" &&
//                    u.getGetUserName().equals("zhangsan")&&
//                    u.getPassword().equals("123456"))
//            {
        if (u.getUsername() == "zhangzhan" &&
                u.getPassword() == "123456") {
            user = new User();
            user.setName("lisi");
            user.setAge("12");
            user.setSex("s2222");
            return user.toString();


        }
        return u.getPassword();


    }
}





