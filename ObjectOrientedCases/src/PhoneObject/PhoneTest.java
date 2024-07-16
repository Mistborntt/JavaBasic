package PhoneObject;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];

        Phone phone1 = new Phone("华为Pura70Pro+", 7999.0, "黑色");
        Phone phone2 = new Phone("iPhone15ProMax", 9999.0, "白色");
        Phone phone3 = new Phone("小米14Ultra", 6499.0, "蓝色");

        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;

        double sum = 0;
        for (Phone i : phones) {
            sum += i.getPrice();
        }
        double avg = sum / phones.length;

        System.out.println("平均价格为：" + avg);
    }
}
