package StaticLearning;

import java.util.StringJoiner;

public class ArrayUtil {
    // 私有化构造方法
    // 目的：为了不让外界创建对象
    private ArrayUtil() {
    }

    // 返回整数数组的内容
    public static String printArr(int [] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }

        return sj.toString();
    }

    // 返回平均分
    public static double getAverage(double[] arr) {
        double sum = 0;
        int count = 0;
        for (double score : arr) {
            sum += score;
            count++;
        }

        double avg = sum / count;

        return avg;
    }
}
