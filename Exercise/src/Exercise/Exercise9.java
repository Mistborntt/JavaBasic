package Exercise;
import java.util.Scanner;

public class Exercise9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票的票号：");
        int ticket = sc.nextInt();
        if (ticket >= 1 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        } else {
            System.out.println("请输入正确的电影票的票号！");
        }
    }
}
