package Exercise;
import java.util.Scanner;

public class Exercise4 {
    public static int Max (int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;

        System.out.println("个位：" + ones);
        System.out.println("十位：" + tens);
        System.out.println("百位：" + hundreds);
    }
}
