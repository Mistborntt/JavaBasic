package InheritanceLearning;

public class TestDemo7 {
    public static void main(String[] args) {
        Worker w = new Worker("ljt", 23);
        System.out.println(w.getName() + ", " + w.getAge());
        System.out.println(w.getClass());
    }
}
