package StaticLearning;

import java.util.ArrayList;

public class StudentUtilTestDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("李锦涛", 23, "男");
        Student stu2 = new Student("廖文华", 25, "男");
        Student stu3 = new Student("董凯瑞", 17, "男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
