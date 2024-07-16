package CommodityObject;

public class CommodityTest {
    public static void main(String[] args) {
        // 创建数组
        Commodity[] productList = new Commodity[3];

        // 创建3个商品对象
        Commodity product1 = new Commodity("001", "华为Pura70Pro+", 7999.0, 5000);
        Commodity product2 = new Commodity("002", "iPhone15ProMax", 9999.0, 7000);
        Commodity product3 = new Commodity("003", "小米14Ultra", 6499.0, 8000);

        // 将商品对象存入数组
        productList[0] = product1;
        productList[1] = product2;
        productList[2] = product3;

        // 遍历
        for (Commodity i : productList) {
            i.commodityInfo();
        }
    }
}
