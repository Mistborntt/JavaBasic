package InheritanceLearning.Exercise1;

public class Staff {
    String employeeID;
    String name;
    double salary;

    public Staff() {
    }

    public Staff(String employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}
