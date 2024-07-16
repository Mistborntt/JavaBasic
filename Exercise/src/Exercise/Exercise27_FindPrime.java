package Exercise;

public class Exercise27_FindPrime {
    public static void main(String[] args) {
        int min = 101;
        int max = 200;

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print('\n');
        System.out.print("一共" + count + "个质数");
    }

    public static boolean isPrime(int num) {
        int result = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                result = 0;
                break;
            }
        }

        return result == 1;
    }
}
