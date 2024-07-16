package Exercise;
import java.util.Scanner;

public class Exercise13_IsPalindrome {
    public static boolean isPalindromeNumber(int num) {
        // 是否为回文数
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reverse = 0;
        int origin = num;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return origin == reverse;

        // 优化
        // 避免反转整个整数可能导致的溢出问题
        // 减少计算量，因为只需要处理一半的数字
//        int reverseHalf = 0;
//
//        while (num > reverseHalf) {
//            reverseHalf = reverseHalf * 10 + num % 10;
//            num /= 10;
//        }
//
//        return num == reverseHalf || num == reverseHalf / 10;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        if (isPalindromeNumber(num)) {
            System.out.println(num + "是回文数");
        } else {
            System.out.println(num + "不是回文数");
        }
    }
}
