package Api_Test.Arrary;

public class ArraryTest {



    // s数组又一个缺点 程序运行期间 数组长度不能改变   引进arraylist 修复缺点

    public static void main(String[] args) {

        // 定义一个长度为3 person 类型的数组
        person [] array = new person[4];
        System.out.println(array[0]);

        person one = new person("古力娜扎",22);
        person two = new person("迪丽热巴",23);
        person three = new person("玛尔扎哈",99);
        person fore = new person("礼拜",100);

            //放进去的是地址值
        array[0] = one;
        array[1] = two;
        array[2] = three;
        array[3]= fore;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[0].getName());
    }
}
