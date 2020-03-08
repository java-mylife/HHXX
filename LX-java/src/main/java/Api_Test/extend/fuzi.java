package Api_Test.extend;

public class fuzi {



   /**  *
    在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

    直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
    间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
            */
    public static void main(String[] args) {

        fu fu = new fu();
        System.out.println(fu.numfu); //只能使用父类的东西  没有子类的东西；

        zi zi = new zi();
        System.out.println(zi.numfu);
        System.out.println(zi.numzi);
        System.out.println("====================="
        );

        //等号左边是谁 就优先谁
        System.out.println(zi.num); //优先子类 200
        //System.out.println(zi.abc); // 到处都没有，编译报错！

        //这个方法是子类的 优先用子类的  没有再向上找；
        zi.methodzi();
        zi.methodfu();

    }

}


