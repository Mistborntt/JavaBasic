package Exercise;

public class Exercise36_ThisKyeword {
    private String name;
    private int age;

    public void Person(String name, int age) {
        this.name = name; // 使用 this 引用当前对象的 name 属性
        this.age = age;   // 使用 this 引用当前对象的 age 属性
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
