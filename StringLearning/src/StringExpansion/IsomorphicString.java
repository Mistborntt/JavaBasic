package StringExpansion;
import java.util.Objects;

public class IsomorphicString {
    public static void main(String[] args) {
        String str = "123123";
        System.out.println(isIsomorphic(str));
    }

    public static boolean isIsomorphic(String str) {
        StringBuilder sb = new StringBuilder(str);
        String str_rev = sb.reverse().toString();

        int result = 0;
        if (Objects.equals(str, str_rev)) {
            result = 1;
        }

        return result == 1;
    }
}
