package Api_Test.Arrary;

import java.util.ArrayList;
import java.util.Random;

public class tm333 {

    /**
     * 题目：
     * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
     * 要求使用自定义的方法来实现筛选。
     * <p>
     * 分析：
     * 1. 需要创建一个大集合，用来存储int数字：<Integer>
     * 2. 随机数字就用Random nextInt
     * 3. 循环20次，把随机数字放入大集合：for循环、add方法
     * 4. 定义一个方法，用来进行筛选。
     * 筛选：根据大集合，筛选符合要求的元素，得到小集合。
     * 三要素
     * 返回值类型：ArrayList小集合（里面元素个数不确定）
     * 方法名称：getSmallList
     * 参数列表：ArrayList大集合（装着20个随机数字）
     * 5. 判断（if）是偶数：num % 2 == 0
     * 6. 如果是偶数，就放到小集合当中，否则不放。
     */


    public static void main(String[] args) {


        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);
//            System.out.println(biglist);
        }


        ArrayList<Integer> res = getsamlllist(biglist);
        System.out.println("小集合一共有多少个偶数"+res.size());

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }


    }

    public static ArrayList<Integer> getsamlllist(ArrayList<Integer> biglist) {

        //创建小集合
        ArrayList<Integer> samlllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0) {
                samlllist.add(num);
            }

        }
        System.out.println(samlllist);
        return samlllist;


    }


}
