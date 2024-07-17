package InheritanceLearning;

public class TestDemo5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }
}

class Student extends Person {
    public void lunch() {
        eat();
        drink();
    }
}
