package StringExpansion;
import java.util.Scanner;

public class StringIntegration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String s = sc.next();

        // 遍历字符串
        stringTraversal(s);

        // 统计字符次数
        int[] count = charCount(s);
        int uppercase = count[0];
        int lowercase = count[1];
        int number = count[2];
        System.out.println("大写字母字符：" + uppercase);
        System.out.println("小写字母字符：" + lowercase);
        System.out.println("数字字符：" + number);

        // 拼接字符串
        int[] arr = {1, 2, 3, 4};
        String result = stringConcatenation(arr);
        System.out.println(result);

        // 反转字符串
        String rev = stringReverse(s);
        System.out.println(rev);
    }


    public static void stringTraversal(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static int[] charCount(String s) {
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 48 && ch <= 57) {
                number++;
            } else if (ch >= 65 && ch <= 90) {
                uppercase++;
            } else if (ch >= 97 && ch <= 122) {
                lowercase++;
            }
        }

        int[] count = {uppercase, lowercase, number};
        return count;
    }

    public static String stringConcatenation(int[] arr) {
        StringBuilder result = new StringBuilder();

        if (arr == null) {
            result = new StringBuilder();
        } else if (arr.length == 0) {
            result = new StringBuilder("[]");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    result.append("[").append(arr[i]).append(",");
                } else if (i == arr.length - 1) {
                    result.append(arr[i]).append("]");
                } else {
                    result.append(arr[i]).append(",");
                }
            }
        }

        return result.toString();
    }

    public static String stringReverse(String str) {
        StringBuilder strReverse = new StringBuilder(str);

        for (int i = 0; i < strReverse.length() / 2; i++) {
            char temp = strReverse.charAt(str.length() - 1 - i);
            strReverse.setCharAt(strReverse.length() - 1 - i, strReverse.charAt(i));
            strReverse.setCharAt(i, temp);
        }

        return strReverse.toString();
    }
}
