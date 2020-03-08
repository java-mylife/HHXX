package Api_Test.Arrary;


import lombok.Data;

@Data
public class student {


    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
