package Exercise;

public class Exercise30_NumberEncryption {
    public static void main(String[] args) {
        System.out.println(numEncryption(12345));
    }

    public static String numEncryption(int origin) {
        int num = origin;
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        StringBuilder code = new StringBuilder(count);

        int digit = 0;
        num = origin;
        while (num > 0) {
            digit = (num % 10 + 5) % 10;
            code.append(digit);
            num /= 10;
        }

        if (code.charAt(0) == '0') {
            code.deleteCharAt(0);
        }

        return code.toString();
    }
}
