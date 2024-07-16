package Exercise;
import java.util.Random;

public class Exercise32_DoubleChromosphere {
    public static void main(String[] args) {
        int[] lotto = {5, 11, 25, 32, 1, 15};
        int[] prize = doubleChromosphere();

        for (int i : prize) {
            System.out.print(i + " ");
        }

        int redcount = 0;
        int bluecount = 0;
        for (int i = 0; i < lotto.length; i++) {
            if (i < 5) {
                if (lotto[i] == prize[i]) {
                    redcount++;
                }
            } else {
                if (lotto[i] == prize[i]) {
                    bluecount++;
                }
            }
        }

        if (redcount == 6 && bluecount == 1) {
            System.out.println("一等奖：最高1000万");
        } else if (redcount == 6 && bluecount == 0) {
            System.out.println("二等奖：最高500万");
        } else if (redcount == 5 && bluecount == 1) {
            System.out.println("三等奖：3000元");
        } else if ((redcount == 5 && bluecount == 0) || (redcount == 4 && bluecount == 1)) {
            System.out.println("四等奖：200元");
        } else if ((redcount == 4 && bluecount == 0) || (redcount == 3 && bluecount == 1) || (redcount == 2 && bluecount == 1)) {
            System.out.println("五等奖：10元");
        } else if ((redcount == 1 && bluecount == 1) || (redcount == 0 && bluecount == 1)) {
            System.out.println("六等奖：5元");
        } else {
            System.out.println("未中奖");
        }
    }

    public static int[] doubleChromosphere() {
        int[] reds = new int[33];
        int[] blues = new int[16];

        for (int i = 0; i < reds.length; i++) {
            reds[i] = i + 1;
            if (i < blues.length) {
                blues[i] = i + 1;
            }
        }

        int[] result = new int[7];
        Random rd = new Random();

        int i = 0;
        while(i < result.length - 1) {
            int redindex = rd.nextInt(reds.length);
            int num = reds[redindex];

            if (!isContain(result, num)) {
                result[i] = num;
                i++;
            }
        }

        int blueindex = rd.nextInt(blues.length);
        result[result.length - 1] = blues[blueindex];

        return result;
    }

    public static boolean isContain(int[] arr, int num) {
        int result = 0;
        for (int i : arr) {
            if (i == num) {
                result = 1;
                break;
            }
        }

        return result == 1;
    }
}
