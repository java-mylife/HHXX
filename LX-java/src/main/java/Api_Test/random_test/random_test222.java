package Api_Test.random_test;

import java.util.Random;

public class random_test222 {


    public static void main(String[] args) {


        int n = 5;
        Random r = new Random();


        for (int i = 0; i < 10; i++) {


            int res = r.nextInt(n) + 1;  //本来是0 -4   整体加一  范围变成 1-5

            System.out.println(res);
        }


    }
}
