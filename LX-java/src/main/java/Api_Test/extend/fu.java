package Api_Test.extend;

public class fu {


    int numfu = 10;
    int num = 100;



    public void methodfu(){


        //使用的是本类中的 不会向下找子类
        System.out.println(num);
    }

}
