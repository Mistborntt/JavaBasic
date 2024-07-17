package InheritanceLearning.Exercise1;

public class Manager extends Staff{
    private double bonus;

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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
