package Exercise;

public class Exercise18_Array1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};

        for (int i : arr) {
            System.out.println(i);
        }

        // 数据的长度属性：数组名.length
        // 自动生成数组遍历：数组名.fori
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 遍历数组并求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);

        // 统计个数
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            if (arr2[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("能被3整除的数字有" + count + "个");

        // 变化数据
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 1) {
                arr3[i] *= 2;
            } else {
                arr3[i] /= 2;
            }
            System.out.println(arr3[i]);
        }

        // 动态初始化
        String[] array = new String[50];

    }
}
