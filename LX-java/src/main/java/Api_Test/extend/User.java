package Api_Test.extend;


import lombok.Data;

@Data
public class User {

    private String name;
    private int money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
