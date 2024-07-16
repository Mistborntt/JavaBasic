package Exercise;

public class Exercise21_MethodReload {
    public static void main(String[] args) {
        System.out.println(compare(10, 20));
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }
}
