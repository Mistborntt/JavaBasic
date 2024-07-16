package Exercise;

public class Exercise35_PrivateKeyword {
    private int age;

    public void setAge(int num) {
        if (num >= 18 && num <= 50) {
            age = num;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge() {
        return age;
    }
}
