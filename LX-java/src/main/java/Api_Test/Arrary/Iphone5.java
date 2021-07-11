package Api_Test.Arrary;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Iphone5 extends Iphone4{
    private String brand = "苹果5";

    @Override
    public void test(){
        System.out.println("5");;
    }
    public static void main(String[] args) {
        Iphone5 iphone5 =new Iphone5();
        iphone5.faduanxin();
        iphone5.test();

    }


}
