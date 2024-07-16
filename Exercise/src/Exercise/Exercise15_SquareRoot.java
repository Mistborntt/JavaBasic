package Exercise;
import java.util.Scanner;

public class Exercise15_SquareRoot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int num = sc.nextInt();

        int sq = 0;
        for (int i = 1; i < num; i++) {
            if (i * i >= num) {
                sq = i;
                break;
            }
        }
        if (sq * sq > num) {
            System.out.println("平方根为：" + (sq - 1));
        } else {
            System.out.println("平方根为：" + sq);
        }
    }
}
