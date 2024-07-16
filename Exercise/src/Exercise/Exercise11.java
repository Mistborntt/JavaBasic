package Exercise;
import java.util.Scanner;

public class Exercise11 {
    public static void main (String[] args) {
        // 打印5次Hello World
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World");
        }

        // 打印1～5
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        // 执行5次断线重连
        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次执行断线重连");
        }

        // 对1～5求和
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 求1～100偶数和
        sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 统计指定范围内，既能被3整除又能被5整除的数字个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入指定范围：");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
