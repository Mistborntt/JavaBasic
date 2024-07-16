package Exercise;
import java.util.Random;

public class Exercise31_LotteryDraw {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        snatchRedEnvelopes(arr);
        grabRedEnvelopes(arr);
    }

    public static void snatchRedEnvelopes(int[] arr) {
        Random rd = new Random();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; ) {
            int randomIndex = rd.nextInt(arr.length);
            int prize = arr[randomIndex];

            if (!isContain(result, prize)) {
                result[i] = prize;
                i++;
            }
        }

        for (int i : result) {
            System.out.println(i + "元的奖金被抽出！");
        }
    }

    public static void grabRedEnvelopes(int[] arr) {
        Random rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rd.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i : arr) {
            System.out.println(i + "元的奖金被抽出！");
        }
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
