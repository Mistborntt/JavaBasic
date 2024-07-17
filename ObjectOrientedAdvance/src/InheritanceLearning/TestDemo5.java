package InheritanceLearning;

public class TestDemo5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        InternationalStudent is = new InternationalStudent();
        is.lunch();
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

// 留学生
class InternationalStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝高端矿泉水");
    }
}
