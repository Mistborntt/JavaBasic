package Exercise;

public class Exercise29_AverageScore {
    public static void main(String[] args) {
        int[] arr = {90, 60, 50, 70, 80, 40};
        System.out.println(getScore(arr));
    }

    public static double getScore(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        double score = 0;

        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        score = (double)(sum - min - max) / (arr.length - 2);

        return score;
    }
}
