package StaticLearning;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "张青川";
        // 创建第一个学生对象
        Student stu1 = new Student();

        stu1.setName("李锦涛");
        stu1.setAge(23);
        stu1.setGender("男");

        stu1.show();
        stu1.study();

        // 创建第二个学生对象
        Student stu2 = new Student("廖文华", 25, "男");

        stu2.show();
        stu2.study();
    }
}
