package InterfaceLearning;

public interface Vehicle {
    // 不能定义实例成员变量和构造方法，但可以定义静态常量
    int MAX_PRICE = 10000000;

    void showPrice();

}
