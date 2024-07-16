package Exercise;

public class Exercise1_HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!");
        System.out.println("name" + '\t' + "age");
        System.out.println(17);
//        System.out.println(017);
        System.out.println(0x17);
        System.out.println(0b11);

        int[] arr = {10, 20, 50, 70, 90, 200,};
        int max = arr[0];

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
