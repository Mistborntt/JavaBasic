package InheritanceLearning;

public class TestDemo2 {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi z1 = new Zi();

        // 利用带参构造创建子类对象
        Zi z2 = new Zi("ljt", 23);

        // 成员变量继承
        Zi z3 = new Zi();

        z3.name = "李锦涛";
        z3.age = 23;
        z3.game = "王者荣耀";
        System.out.println(z3.name + z3.age + z3.game);
    }
}

class Fu {
    String name;
    int age;

    public Fu() {

    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    String game;

    // 如果一个类中没有构造方法，虚拟机会自动添加一个默认的空参构造
    public Zi() {

    }

    public Zi(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
