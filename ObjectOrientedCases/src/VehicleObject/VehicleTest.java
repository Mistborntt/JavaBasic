package VehicleObject;
import java.util.Scanner;

/*
键盘录入
第一套体系
nextInt();  接收整数
nextDouble();  接收小数
next();  接收字符串
遇到空格、制表符和回车就停止接收，这些符号后面的数据就不会接收了

第二套体系
nextLine();  接收字符串
可以接收空格和制表符，遇到回车才停止接收数据

键盘录入的两套体系不能混用
*/

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            Vehicle car = new Vehicle();

            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            car.setBrand(brand);

            System.out.println("请输入汽车价格：");
            double price = sc.nextDouble();
            car.setPrice(price);

            System.out.println("请输入汽车颜色：");
            String color = sc.next();
            car.setColor(color);

            cars[i] = car;
        }

        for (Vehicle i : cars) {
            i.commodityInfo();
        }
    }
}
