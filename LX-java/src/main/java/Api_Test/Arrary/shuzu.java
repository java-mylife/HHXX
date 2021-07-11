package Api_Test.Arrary;

public class shuzu {

    public static void main(String[] args) {
        
        int size = 5;
        int [] arr = new  int[5];
        arr[0]= 1;
        arr[1]=2;
        arr[2]= 3;               
        arr[3]=4;
        arr[4]=5;
        int toal  =0;
        for (int i = 0; i < arr.length; i++) {
            toal += arr[i];
        }
        System.out.println(toal);
        for (int abc:arr
             ) {
            System.out.println(abc);

        }

    }
}
