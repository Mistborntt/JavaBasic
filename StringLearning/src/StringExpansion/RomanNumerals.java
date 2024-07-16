package StringExpansion;
import java.util.Scanner;

public class RomanNumerals {
    public static final char[] ROMAN_NUMERALS = {' ', 'Ⅰ', 'Ⅱ','Ⅲ', 'Ⅳ', 'Ⅴ', 'Ⅵ', 'Ⅶ', 'Ⅷ', 'Ⅸ'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String str = sc.next();

        int notNum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 48 || ch > 57) {
                notNum = 1;
                break;
            }
        }

        if (str.length() > 9 && notNum == 0) {
            System.out.println("输入字符串过长！");
        } else if (str.length() <= 9 && notNum == 1) {
            System.out.println("输入字符串包含非数字字符！");
        } else if (str.length() > 9 && notNum == 1) {
            System.out.println("输入字符串过长且包含非数字字符！");
        } else {
            System.out.println("罗马数字为：" + toRomanNumerals(str));
        }
    }

    public static String toRomanNumerals(String str) {
        StringBuilder rn = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 48;
            rn.append(ROMAN_NUMERALS[index]);
        }

        return rn.toString();
    }
}
