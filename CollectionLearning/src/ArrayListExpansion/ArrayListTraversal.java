package ArrayListExpansion;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // 集合遍历
        ArrayList<String> list = new ArrayList<>();

        list.add("ljt");
        list.add("gjj");
        list.add("wjl");
        list.add("wz");

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (String i : list) {
            sj.add(i);
        }
        System.out.println(sj.toString());

        // 添加数字并遍历
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2000);
        list1.add(1106);
        list1.add(520);
        list1.add(666);

        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
        for (int i : list1) {
            sj1.add(String.valueOf(i));
        }
        System.out.println(sj1.toString());

        // 添加学生对象并遍历

        ArrayList<Student> list2 = new ArrayList<>();
        Student stu1 = new Student("001", "李锦涛", 23, "杭州市");
        Student stu2 = new Student("002", "闻政", 23, "铜陵市");
        Student stu3 = new Student("003", "高佳骏", 23, "杭州市");

        list2.add(stu1);
        list2.add(stu2);
        list2.add(stu3);

        for (Student stu : list2) {
            System.out.println(stu.getName() + stu.getAge());
        }
    }
}
