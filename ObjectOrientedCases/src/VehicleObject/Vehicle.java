package VehicleObject;

public class Vehicle {
    private String brand;
    private double price;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String brand, double price, String color) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void commodityInfo() {
        System.out.println("品牌：" + getBrand());
        System.out.println("价格：" + getPrice());
        System.out.println("颜色：" + getColor());
    }
}
