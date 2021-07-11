package Api_Test.Arrary;

import java.util.ArrayList;

public class Test_javac1 {

    public static void main(String[] args) {
        int [] arr = {1,1,22,33,44};
        ArrayList<String> list = new ArrayList<String>();
        list.add("精神小伙");
        list.add("塞班");
        list.add("开跑");
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
