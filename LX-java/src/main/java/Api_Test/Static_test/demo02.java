package Api_Test.Static_test;

public class demo02 {


    public static void main(String[] args) {

        /**
一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

         如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。


         如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1. 静态不能直接访问非静态。
原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
“先人不知道后人，但是后人知道先人。”
2. 静态方法当中不能用this。
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
 */

        Student one = new Student(1,"黄蓉",18);
        Student two = new Student(2,"郭靖",20);
        one.room = "101教室";
        System.out.println("姓名是： "+ one.getName()+"年龄是： "+ one.getAge()+"学号是： "+ one.getId()+"教室在： "+ one.room);
        System.out.println("姓名是： "+ two.getName()+"年龄是： "+ two.getAge()+"学号是： "+ two.getId()+"教室在： "+ two.room);
        Myclass myclass = new Myclass();
    }
}
