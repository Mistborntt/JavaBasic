package InheritanceLearning;

public class Worker extends Human {
    // 子类的无参构造
    public Worker() {
        // 隐藏super()去访问父类的无参构造
        super();
    }

    public Worker(String name, int age) {
        super(name, age);
    }
}
