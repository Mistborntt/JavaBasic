package ArrayListExpansion;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone phone1 = new Phone("小米", 1999);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        cheapInfo(list);
    }

    public static void cheapInfo(ArrayList<Phone> list) {
        ArrayList<Phone> newList = new ArrayList<>();

        for (Phone p : list) {
            if (p.getPrice() < 3000) {
                newList.add(p);
            }
        }

        for (Phone p : newList) {
            System.out.println(p.getBrand() + ", " + p.getPrice());
        }
    }
}
