package Api_Test.scanner_test;

import java.util.Scanner;

public class Api_scanner111 {




    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入数字a");
        int a = sc.nextInt();
        System.out.println("请输入数字b");
        int b = sc.nextInt();
        int res = a + b ;
        System.out.println("结果是"+res);


    }
}
