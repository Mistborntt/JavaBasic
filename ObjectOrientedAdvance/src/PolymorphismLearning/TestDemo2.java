package PolymorphismLearning;

public class TestDemo2 {
    public static void main(String[] args) {
        // 创建对象（多态方式）
        Animal dog = new Dog();
        Animal cat = new Cat();

        // 调用成员变量：编译看左边，运行也看左边
        // 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功；如果没有，编译失败
        // 运行也看左边：java运行代码的时候，实际获取的就是左边父类中成员变量的值
        System.out.println(dog.name);
        System.out.println(cat.name);

        // 调用成员方法：编译看左边，运行看右边
        // 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功；如果没有，编译失败
        // 运行看右边：java运行代码的时候，实际上运行的是子类中的方法
        dog.show();
        cat.show();

        // 成员变量：在子类的对象中，会把父类的成员变量也继承下的
        // 成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的
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
