package Exercise;
import java.util.Random;

public class Exercise28_VerificationCode {
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";

    public static void main(String[] args) {
        System.out.println(verificationCode());
        System.out.println(getCode());
    }

    public static String verificationCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder(5);

        for (int i = 0; i < 4; i++) {
            code.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }

        code.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));

        return code.toString();
    }

    public static String getCode() {
        char[] letters = new char[52];
        int [] numbers = new int [10];

        for (int i = 0; i < letters.length; i++) {
            if (i < 26) {
                letters[i] = (char)(65 + i);
            } else {
                letters[i] = (char)(97 + i - 26);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        Random random = new Random();
        StringBuilder code = new StringBuilder(5);

        for (int i = 0; i < 4; i++) {
            code.append(letters[random.nextInt(letters.length)]);
        }

        code.append(numbers[random.nextInt(numbers.length)]);

        return code.toString();
    }
}
