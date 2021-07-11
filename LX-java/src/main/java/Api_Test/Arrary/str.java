package Api_Test.Arrary;

public class str {





    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append("javanameber");
        System.out.println(stringBuilder);
        stringBuilder.insert(11,"one");
        System.out.println(stringBuilder);
        stringBuilder.reverse().toString();
        System.out.println(stringBuilder);
        String str1 = new String("中国");
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.reverse().toString();
        System.out.println(stringBuffer);
        String str2 = "213214dfsf";
        int b = stringBuffer.lastIndexOf(str2);
        int a = str2.length();
        System.out.println(a);
        System.out.println(b);

    }
}
