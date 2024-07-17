package InheritanceLearning.Exercise1;

public class Manager extends Staff{
    double bonus;

    public Manager() {

    }

    public Manager(String employeeID, String name, double salary, double bonus) {
        super(employeeID, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
