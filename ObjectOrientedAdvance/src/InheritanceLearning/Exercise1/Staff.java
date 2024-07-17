package InheritanceLearning.Exercise1;

public class Staff {
    private String employeeID;
    private String name;
    private double salary;

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

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
