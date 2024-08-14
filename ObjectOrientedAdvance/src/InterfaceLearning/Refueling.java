package InterfaceLearning;

public interface Refueling {
    void refuel();

    default void pay() {
        System.out.println("付油钱");
    }
}
