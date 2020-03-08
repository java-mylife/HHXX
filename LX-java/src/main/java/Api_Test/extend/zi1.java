package Api_Test.extend;

public class zi1 extends fu1{

    int num = 10;


    @Override
    public void method(){

        super.method();  //子类调用父类方法
        System.out.println("这是子类方法");

    }

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
    }
}
