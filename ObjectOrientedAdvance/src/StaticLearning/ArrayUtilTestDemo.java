package StaticLearning;

public class ArrayUtilTestDemo {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6};
        double[] scoreArr = {98, 50, 89, 100, 91, 60.5, 88};

        String str = ArrayUtil.printArr(numArr);
        System.out.println(str);

        double avg = ArrayUtil.getAverage(scoreArr);
        System.out.println(avg);
    }
}
