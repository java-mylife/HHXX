package com.baidu.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teach")
public class groups3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
