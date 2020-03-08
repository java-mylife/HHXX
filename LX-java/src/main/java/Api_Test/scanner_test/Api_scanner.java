package Api_Test.scanner_test;

import java.util.Scanner;

public class Api_scanner {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        String str = sc.next();
        System.out.println("输入的数字是："+ num);
        System.out.println("输入的字符串是"+ str);
    }
}
