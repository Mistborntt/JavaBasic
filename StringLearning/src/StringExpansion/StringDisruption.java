package StringExpansion;
import java.util.Random;

public class StringDisruption {
    public static void main(String[] args) {
        String str = "abcdefg";
        String strShuffled = disruptOrder(str);

        System.out.println(strShuffled);
    }

    public static String disruptOrder(String str) {
        char[] chs = str.toCharArray();

        // Fisher-Yates 洗牌算法
        Random rd = new Random();
        for (int i = chs.length - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1 );

            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }

        String strShuffled = new String(chs);

        return strShuffled;
    }
}
