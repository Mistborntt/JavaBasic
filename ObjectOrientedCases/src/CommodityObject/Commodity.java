package CommodityObject;

public class Commodity {
    private String ID;
    private String name;
    private double price;
    private int amount;

    public Commodity() {

    }

    public Commodity(String ID, String name, double price, int amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void commodityInfo() {
        System.out.println("ID：" + getID());
        System.out.println("名称：" + getName());
        System.out.println("价格：" + getPrice());
        System.out.println("库存：" + getAmount());
    }
}
