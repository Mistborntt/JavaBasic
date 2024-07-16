package Exercise;

public class Exercise14_7Pass {
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i++) {
            int ones = i % 10;
            int tens = i / 10 % 10;

            if (i % 7 == 0 || ones == 7 || tens == 7) {
                System.out.println("过");
                continue;
            }

            System.out.println(i);
        }
    }
}
