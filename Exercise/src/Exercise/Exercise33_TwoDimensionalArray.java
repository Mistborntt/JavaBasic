package Exercise;

public class Exercise33_TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9}
        };

        int [][] arr2 = new int[2][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }

            System.out.println();
        }

        int[][] turnover = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int quarterSum = 0;
        for (int i = 0; i < turnover.length; i++) {
            quarterSum = 0;
            for (int j = 0; j < turnover[i].length; j++) {
                quarterSum += turnover[i][j];
            }
            System.out.println("第" + (i + 1) + "季度的营业额为：" + quarterSum + "万元");
        }


        int sum = 0;
        for (int i = 0; i < turnover.length; i++) {
            for (int j = 0; j < turnover[i].length; j++) {
                sum += turnover[i][j];
            }
        }
        System.out.println("全年的总营业额为：" + sum + "万元");
    }
}
