package Api_Test.String_test;

public class demo04 {

    /**
     * String当中与获取相关的常用方法有：
     * <p>
     * public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
     * public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
     * public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
     * public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
     */

    public static void main(String[] args) {


        //获取字符串长度；
        String str1 = "dsajfnbndsaongmondgndgpnmgkg";
        System.out.println("asfasfsgasfagsdgadh".length());
        System.out.println(str1.length());
        //拼接字符串；

        // 拼接字符串
        String str0 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str0); // Hello，原封不动
        System.out.println(str2); // World，原封不动
        System.out.println(str3); // HelloWorld，新的字符串
        System.out.println("==============");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);
        System.out.println("==============");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1

        /**
         字符串的截取方法：

         public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
         public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
         备注：[begin,end)，包含左边，不包含右边。

         String str1 = "HelloWorld";
         String str2 = str1.substring(5);
         System.out.println(str1); // HelloWorld，原封不动
         System.out.println(str2); // World，新字符串
         System.out.println("================");

         String str3 = str1.substring(4, 7);
         System.out.println(str3); // oWo
         System.out.println("================");

         // 下面这种写法，字符串的内容仍然是没有改变的
         // 下面有两个字符串："Hello"，"Java"
         // strA当中保存的是地址值。
         // 本来地址值是Hello的0x666，
         // 后来地址值变成了Java的0x999
         String strA = "Hello";
         System.out.println(strA); // Hello
         strA = "Java";
         System.out.println(strA); // Java
         */
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
    }
}
