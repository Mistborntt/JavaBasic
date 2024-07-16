package Exercise;
import java.util.Random;

public class Exercise19_Array2 {
    public static void main(String[] args) {
//        // 最大值
//        int[] arr = {33, 5, 22, 44, 55,};
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("数组中的最大值为：" + max);
//
//        // 求和并统计个数
//        int[] arr = new int[10];
//        int min = 1;
//        int max = 100;
//
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(max - min + 1) + min;
//        }
//
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        double avg = (double) sum / arr.length;
//
//        int count = 0;
//        for (int i : arr) {
//            if (i < avg) {
//                count++;
//            }
//        }
//
//        System.out.println("所有数据的和为：" + sum);
//        System.out.println("所有数据的平均数为：" + avg);
//        System.out.println("有" + count + "个数据比平均值小");
//
//        // 交换数组中的数据
//        int[] arr = {1, 2, 3, 4, 5};
//        int temp = arr[4];
//
//        arr[4] = arr[0];
//        arr[0] = temp;
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        // 利用循环交换数据
//        int[] arr = {1, 2, 3, 4, 5};
//
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }

        // 打乱数组中的数据
        int[] arr = {1, 2, 3, 4, 5};
        Random  rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rd.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
