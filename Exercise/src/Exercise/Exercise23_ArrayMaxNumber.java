package Exercise;

public class Exercise23_ArrayMaxNumber {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        System.out.println(arrayMaxNumber(arr));
    }

    public static int arrayMaxNumber(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }

        return max;
    }
}
