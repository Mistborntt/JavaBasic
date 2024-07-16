package StringExpansion;
import java.util.Objects;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "李四";
        String s2 = "张三";
        String s3 = new String("abc");
        String s4 = "Abc";

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
