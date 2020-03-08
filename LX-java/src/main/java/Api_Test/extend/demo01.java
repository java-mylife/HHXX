package Api_Test.extend;

import sun.jvm.hotspot.utilities.Assert;

public class demo01 {


    public static void main(String[] args) {


        //创建一个子类对象；
        teacher teacher = new teacher();
        //虽然什么都没有 但是继承了父类的 method；
        teacher.method();

        //创建一个助教类对象；
        Assistant assistant = new Assistant();
        assistant.method();

    }



}
