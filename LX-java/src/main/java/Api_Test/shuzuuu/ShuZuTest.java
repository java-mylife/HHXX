package Api_Test.shuzuuu;

public class ShuZuTest {




    public static void main(String[] args) {

        int[]arrayA = {11,12,13,14,15,66,77,88};
        System.out.println(arrayA);  //地址值
        System.out.println(arrayA[2]);
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
            if (arrayA[i]>max){
                max = arrayA[i];
            }
        }
        System.out.println(max);
     }
}
