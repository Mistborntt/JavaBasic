package Exercise;

public class Exercise22_ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        arrayTraversal(arr);
    }

    public static void arrayTraversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
