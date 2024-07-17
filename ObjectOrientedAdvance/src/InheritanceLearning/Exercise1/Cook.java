package InheritanceLearning.Exercise1;

public class Cook extends Staff{
    public Cook() {
    }

    public Cook(String employeeID, String name, double salary) {
        super(employeeID, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
