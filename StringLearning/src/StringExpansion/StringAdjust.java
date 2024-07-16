package StringExpansion;
import java.util.Objects;

public class StringAdjust {
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "345612";

        System.out.println(isMatch(s1, s2));
    }

    public static boolean isMatch(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);

        int match = 0;
        do {
            sb.append(sb.charAt(0)).deleteCharAt(0);
            if (Objects.equals(sb.toString(), s2)) {
                match = 1;
                break;
            }
        } while(!Objects.equals(sb.toString(), s1));

        return match == 1;
    }
}
