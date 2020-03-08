package Api_Test.random_test;

import java.util.Random;

public class random_test111 {

    public static void main(String[] args) {


        Random r = new Random();
        for (int i = 0; i < 100; i++) {
           int num =  r.nextInt(10);
            System.out.println(num);
        }
    }

}
// 左臂右开区间 只能取到 0 - 9