package Exercise;

public class Exercise20_Method {
    public static void main(String[] args) {
        playGame();
        getCircumference(5, 8);
        System.out.println(getSum(10, 20, 30));
    }

    public static void playGame() {
        System.out.println("BP");
        System.out.println("对线");
        System.out.println("团灭");
        System.out.println("胜利");
    }

    public static void getCircumference(double a, double b) {
        double circumference = 2 * (a + b);
        System.out.println(circumference);
    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}
