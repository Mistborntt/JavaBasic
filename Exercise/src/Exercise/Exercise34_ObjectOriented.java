package Exercise;

public class Exercise34_ObjectOriented {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "三星";
        phone.price = 9999.9;

        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
        phone.playGames();
    }
}

class Phone {
    // 属性
    String brand;
    double price;

    // 行为
    public void call() {
        System.out.println("打电话");
    }

    public void playGames() {
        System.out.println("玩游戏");
    }
}
