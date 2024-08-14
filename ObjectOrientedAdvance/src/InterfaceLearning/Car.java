package InterfaceLearning;

public class Car implements Vehicle, Refueling{
    @Override
    public void showPrice() {
        System.out.println("价格为20万");
    }

    @Override
    public void refuel() {
        System.out.println("95号汽油加满");
    }
}
