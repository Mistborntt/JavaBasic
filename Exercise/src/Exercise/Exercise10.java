package Exercise;
import java.util.Scanner;

public class Exercise10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想吃的面种：");
        String noodles = sc.next();

        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("方便面");
                break;
        }

        // case穿透
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("num的值为1");
                break;
            case 10:
                System.out.println("num的值为10");
            case 20:
                System.out.println("num的值为20");
                break;
            default:
                System.out.println("num的值不是1，10或者20");

        }

        // switch新特性
        int number = sc.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }

        // 键盘录入星期几，输出工作日、休息日
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("请输入正确的星期数");
        }
    }
}
