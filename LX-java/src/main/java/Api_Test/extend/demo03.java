package Api_Test.extend;

public class demo03 {

    public static void main(String[] args) {
        Animal animal =new Animal() {
            @Override
            public void eat() {

                System.out.println("使用抽象类的抽象方法");

            }
        };
    }
}
