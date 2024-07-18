package PolymorphismLearning;

public class TestDemo1 {
    public static void main(String[] args) {
        // 创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("李锦涛");
        s.setAge(23);

        Teacher t = new Teacher();
        t.setName("朱来富");
        t.setAge(44);

        Administrator admin = new Administrator();
        admin.setName("超级管理员");
        admin.setAge(100);

        register(s);
        register(t);
        register(admin);

    }

    public static void register(Person p) {
        p.show();
    }
}
