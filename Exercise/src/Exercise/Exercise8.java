package Exercise;
import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩：");
        int score = sc.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("送自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一天");
        } else if (score >= 80 && score <= 89) {
            System.out.println("送变形金刚一个");
        } else {
            System.out.println("揍一顿");
        }
    }
}
