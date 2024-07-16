package Exercise;

public class Exercise24_ArrayNumberIsExist {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int num = 55;

        System.out.println(isExist(num, arr));
    }

    public static boolean isExist(int num, int[] arr) {
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
