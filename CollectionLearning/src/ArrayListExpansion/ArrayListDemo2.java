package ArrayListExpansion;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User(1, "Mistborntt", "ljt001106");
        User user2 = new User(2, "haizhitao", "123456");
        User user3 = new User(3, "zhiendehaiziba", "13018932888");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(isContained(list, 1));

    }

    public static boolean isContained(ArrayList<User> list, int id) {
        int result = 0;
        for (User user: list ) {
            if (user.getId() == id) {
                result = 1;
                break;
            }
        }
        return result == 1;
    }
}
