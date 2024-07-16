package Exercise;
import java.util.Scanner;

public class Exercise16_IsPrime {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }
    }
}
