package PolymorphismLearning;

public class TestDemo2 {
    public static void main(String[] args) {
        // 创建对象（多态方式）
        Animal dog = new Dog();
        Animal cat = new Cat();

        // 调用成员变量：编译看左边，运行也看左边
        System.out.println(dog.name);
        System.out.println(cat.name);

        // 调用成员方法：编译看左边，运行看右边
        dog.show();
        cat.show();
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal --- show方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog --- show方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat --- show方法");
    }
}
