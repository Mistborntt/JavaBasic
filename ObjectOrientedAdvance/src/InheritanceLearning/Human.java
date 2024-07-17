package InheritanceLearning;

public class Human {
    String name;
    int age;
    String university;

    public Human() {
        // 表示调用本类其他构造方法
        // 虚拟机不会再添加super()
        this(null, 0, "BTBU");
    }

    public Human(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}