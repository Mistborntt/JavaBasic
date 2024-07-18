package InheritanceLearning.Exercise1;

public class Test {
    public static void main(String[] args) {
        Manager leader = new Manager("001", "ljt", 18000, 5000);
        leader.work();
        leader.eat();

        Cook cook = new Cook("009", "wz", 8000);
        cook.work();
        cook.eat();
    }
}
