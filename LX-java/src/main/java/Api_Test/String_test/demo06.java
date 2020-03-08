package Api_Test.String_test;

public class demo06 {
    /**
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */


    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String [] arr = str1.split(",");
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("==================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===============");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length); // 0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
