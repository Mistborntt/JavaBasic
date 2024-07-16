package Exercise;
import static Exercise.Exercise22_ArrayTraversal.arrayTraversal;

public class Exercise25_ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] newarr = copyOfRange(arr, 3, 8);

        arrayTraversal(newarr);
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newarr = new int[to - from];
        for (int i = from; i < to; i++) {
            newarr[i - from] = arr[i];
        }
        return newarr;
    }
}
