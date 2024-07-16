package Exercise;
import java.util.Scanner;

public class Exercise7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();

        if (wine > 2) {
            System.out.println("小伙子，不错！");
        }
    }
}
