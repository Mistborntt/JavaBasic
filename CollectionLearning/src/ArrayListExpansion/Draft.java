package ArrayListExpansion;

import java.util.Random;

public class Draft {
    public static void main(String[] args) {
        System.out.println(verificationCode(5));
    }

    public static String verificationCode(int length) {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder code = new StringBuilder();

        // 创建字母和数字集
        for (int i = 65; i <= 90; i++) {
            letters.append((char)i);
        }

        for (int i = 97; i <= 122; i++) {
            letters.append((char)i);
        }

        for (int i = 48; i <= 57; i++) {
            numbers.append((char)i);
        }

        // 添加字母
        Random rd = new Random();
        for (int i = 0; i < length - 1; i++) {
            int index = rd.nextInt(letters.length());
            char ch = letters.charAt(index);
            code.append(ch);
        }

        // 添加1位数字
        code.append(numbers.charAt(rd.nextInt(numbers.length())));

        // 打乱顺序
        for (int i = code.length() - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1);

            char temp = code.charAt(i);
            code.setCharAt(i, code.charAt(j));
            code.setCharAt(j, temp);
        }

        return code.toString();
    }
}
