package Api_Test.random_test;

import java.util.Random;
import java.util.Scanner;

public class random_test333 {


    /**
     * 题目：
     * 用代码模拟猜数字的小游戏。
     * <p>
     * 思路：
     * 1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
     * 2. 需要键盘输入，所以用到了Scanner
     * 3. 获取键盘输入的数字，用Scanner当中的nextInt方法
     * 4. 已经得到了两个数字，判断（if）一下：
     * 如果太大了，提示太大，并且重试；
     * 如果太小了，提示太小，并且重试；
     * 如果猜中了，游戏结束。
     * 5. 重试就是再来一次，循环次数不确定，用while(true)。
     */


    public static void main(String[] args) {

        Random r = new Random();
        int romnum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);


//        while (true){
//
//            System.out.println("请输入你猜测的数字");
//            int a  = sc.nextInt();
//            if (a > romnum){
//                System.out.println("你输入的数字太大了");
//            }else if (a < romnum){
//                System.out.println("你输入的数字太小了");
//            }else {
//                System.out.println("你猜对啦！！！");
//                break;
//            }
//        }
//        System.out.println("游戏结束啦");

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入你猜的数字");
            int b = sc.nextInt();
            if (i < 5) {
                if (b > romnum) {
                    System.out.println("你输入的数字太大了");
                } else if (b < romnum) {
                    System.out.println("你输入的数字太小了");
                } else {
                    System.out.println("恭喜你猜中啦");
                    break;
                }
            } else {
                System.out.println("超过五次，不能再猜啦");
                break;

            }
        }
        System.out.println("游戏结束@@");

    }
}
