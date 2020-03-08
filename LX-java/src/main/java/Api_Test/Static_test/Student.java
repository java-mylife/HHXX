package Api_Test.Static_test;


import lombok.Data;

@Data
public class Student {

    private  int id;
    private String name;
    private int age;
    String room;
    private static int idCounter = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

    public Student(int id , String name , int age ){

        this.age = age;
        this.id = id;
        this.name = name;
    }
}
