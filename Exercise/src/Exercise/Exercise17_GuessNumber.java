package Exercise;
import java.util.Random;
import java.util.Scanner;

public class Exercise17_GuessNumber {
    public static void main (String[] args) {
        Random random = new Random();

        int min = 1;
        int max = 100;
        int num = random.nextInt(max - min + 1) + min; // 左闭右开

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        int guess = sc.nextInt();

        while (true) {
            if (guess > num) {
                System.out.println("大了！");
                guess = sc.nextInt();
            } else if (guess < num) {
                System.out.println("小了！");
                guess = sc.nextInt();
            } else {
                System.out.println("猜中了！");
                break;
            }
        }
    }
}
