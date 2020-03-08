package Api_Test.scanner_test;


import lombok.Data;

@Data
public class Person {
    String name;

    public void showName() {
        System.out.println("我叫：" + name);
    }
}
