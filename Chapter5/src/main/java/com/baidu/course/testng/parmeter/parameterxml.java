package com.baidu.course.testng.parmeter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterxml {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }

//    public static void main(String[] args) {
  //      System.out.println("aaa");
    //}
}

