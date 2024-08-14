package AbstractLearning;

public abstract class Person {

    private String name;
    private int age;

    // 当创建子类对象时，给属性进行赋值的
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public void sleep() {
        System.out.println("睡觉");
    }
}
