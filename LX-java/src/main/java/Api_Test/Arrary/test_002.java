package Api_Test.Arrary;

import lombok.Data;



@Data
public class test_002  {

    public static void main(String[] args) {
        int a ,b ;
        a = 10 ;
        b = (a == 10)?100:20;
        System.out.println(b);
        Integer c = 10;
        switch (c){
            case 1 :
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 10 :
                System.out.println(10);
            case 11:
                System.out.println(11);
        }
    }


}
