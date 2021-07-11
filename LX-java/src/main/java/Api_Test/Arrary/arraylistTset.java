package Api_Test.Arrary;

import java.util.ArrayList;



/**
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空的中括号：[]
 */

public class arraylistTset {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        list.add("古力娜扎");
        System.out.println(list);

        list.add("玛尔扎哈");
        System.out.println(list);
    }
}