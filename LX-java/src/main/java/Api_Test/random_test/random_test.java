package Api_Test.random_test;

import java.util.Random;

public class random_test {

    public static void main(String[] args) {


        Random rm = new Random();
        int res = rm.nextInt();
        System.out.println("随机数是"+res);


    }
}
