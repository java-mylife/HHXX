package Api_Test.Arrays;

import java.util.Arrays;

public class demo02 {


    /**
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */


    public static void main(String[] args) {

        String str = "dansnbabybfapwbsaytio";
        char[] strarr = str.toCharArray();
        Arrays.sort(strarr);     //对字符数组进行升序排列
        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray


        // 需要倒序遍历
        for (int i = strarr.length - 1; i >= 0; i--) {
            System.out.println(strarr[i]);
        }

    }
}
