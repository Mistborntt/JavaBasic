package StringExpansion;
import java.util.StringJoiner;

public class StringJoinerLearning {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        // 创建一个对象，并指定间隔符号、开始符号和结束符号
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // 添加元素
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }

        return sj.toString();
    }
}
