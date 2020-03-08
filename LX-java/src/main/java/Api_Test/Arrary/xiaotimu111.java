package Api_Test.Arrary;

import java.util.ArrayList;

public class xiaotimu111 {


    public static void main(String[] args) {


        ArrayList<student> list = new ArrayList<>();


        student one = new student("洪七公",20);
        student two = new student("洪八公",20);
        student thr = new student("洪九公",20);
        student fore = new student("洪十公",20);

        list.add(one);
        list.add(two);
        list.add(thr);
        list.add(fore);
        System.out.println(list);
        //遍历集合

        for (int i = 0; i < list.size(); i++) {

            student stu = list.get(i);
            System.out.println("姓名是"+stu.getName()+"     年龄是"+stu.getAge());
        }


    }
}
