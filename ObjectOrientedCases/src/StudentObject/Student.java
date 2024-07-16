package StudentObject;

public class Student {
    private String schoolNumber;
    private String name;
    private int age;

    public Student() {

    }

    public Student(String schoolNumber, String name, int age) {
        this.schoolNumber = schoolNumber;
        this.name = name;
        this.age = age;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
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
}
