package InheritanceLearning.Exercise2;

public class Employee {
    private String workNo;
    private String name;
    private String work;

    public Employee() {

    }

    public Employee(String workNo, String name, String work) {
        this.workNo = workNo;
        this.name = name;
        this.work = work;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void work() {
        System.out.println(this.work);
    }
}
