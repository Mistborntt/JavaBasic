package Exercise;

public class Exercise12 {
    public static void main (String[] args) {
        // 打印折纸的次数
        double paper = 0.1;
        int height = 8844430;

        int count = 0;
        while (paper < height) {
            count += 1;
            paper *= 2;
        }
        System.out.println("折叠" + count + "次");
    }
}
