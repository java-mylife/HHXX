package Api_Test.String_test;

import java.util.Scanner;

public class timu02 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串： ");
        String  input = scanner.next();
        System.out.println("你输入的是： "+input);


        int countUpper = 0; // 大写字母
        int countLower = 0; // 小写字母
        int countNumber = 0; // 数字
        int countOther = 0; // 其他字符


        char [] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if ('A'<= ch && ch <= 'Z'){
                countUpper++;
            }else if ('a' <= ch && ch <= 'z'){
                countLower++;
            }else if ('0' <= ch && ch <= '9'){
                countNumber ++;
            }else {
                countOther++;
            }

        }
        System.out.println("大写字母有：" +  countUpper);
        System.out.println("小写字母有：" +  countLower);
        System.out.println("数字有：" +  countNumber);
        System.out.println("其他有：" +  countOther);


    }


}
