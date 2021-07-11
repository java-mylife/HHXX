package Api_Test.Arrary;

public class Test_001 {

    int aa = 100;
    String bb = "中国";
    public Test_001(){
        System.out.println("构造函数");
        }
    public Test_001(int arg){
        this.aa=aa;
        System.out.println(arg);
        System.out.println("有参构造"+aa);
    }
    public int test(){
        return aa;
    }
    public String test(String arg){
        return arg;
    }

    public static void main(String[] args) {
        Test_001 te = new Test_001();
        Test_001 te1 = new Test_001(100);
        te.test();
        te1.test();
    }




}


