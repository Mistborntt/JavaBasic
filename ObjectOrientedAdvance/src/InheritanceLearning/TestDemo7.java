package InheritanceLearning;

public class TestDemo7 {
    public static void main(String[] args) {
        Worker w = new Worker("ljt", 23);
        System.out.println(w.getName() + ", " + w.getAge());
        System.out.println(w.getClass());

        // 可以把对象在内存中的结构打印出来
//        ClassLayout layout = ClassLayout.parseInstance(w);
//        System.out.println(layout.toPrintable());

    }
}
