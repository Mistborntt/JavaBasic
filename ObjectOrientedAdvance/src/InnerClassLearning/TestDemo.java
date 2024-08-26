package InnerClassLearning;

public class TestDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = new Outer().new Inner();

        System.out.println(o.getInstance());
        oi.show();
    }
}
