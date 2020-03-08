package Api_Test.String_test;

public class timu01 {

    /**题目：
    定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。

    分析：
            1. 首先准备一个int[]数组，内容是：1、2、3
            2. 定义一个方法，用来将数组变成字符串
            三要素
    返回值类型：String
    方法名称：fromArrayToString
    参数列表：int[]
3. 格式：[word1#word2#word3]
    用到：for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#、区分一下是不是最后一个
4. 调用方法，得到返回值，并打印结果字符串
     */

    public static void main(String[] args) {
        int [] arr  = {1,2,3,4};
        System.out.println(fromArrayToString(arr));
    }
    public static String fromArrayToString(int [] arry){

        String str = "[" ;
        for (int i = 0; i < arry.length; i++) {
            if (i ==arry.length -1){
                str += "word"+arry [i] +"]";
            }else {
                str += "word"+arry[i]+"#";
            }
        }
        return str;
    }
}
