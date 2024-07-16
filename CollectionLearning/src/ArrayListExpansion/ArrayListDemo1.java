package ArrayListExpansion;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛型：限定集合中存储的数据类型
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        boolean result = list.add("ljt");
        list.add("gjj");
        list.add("wz");
        list.add("lsj");

        System.out.println(result);
        System.out.println(list);

        // 删除元素
        list.remove("lsj");
        System.out.println(list);

        String str = list.remove(1);
        System.out.println(str);

        // 查询元素
        String s = list.get(1);
        System.out.println(s);

        // 集合长度
        int length = list.size();
        System.out.println(length);

        // 遍历元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        for (String i : list) {
            System.out.println(i);
        }

        /*
        此时我们创建的是ArrayList的对象，而ArrayList是Java已经写好的一个类
        这个类在底层做了一些处理
        打印对象不是地址值，而是集合中存储的数据内容
        在展示的时候会拿[]把所有的数据进行包裹
        */
        System.out.println(list);

    }
}
