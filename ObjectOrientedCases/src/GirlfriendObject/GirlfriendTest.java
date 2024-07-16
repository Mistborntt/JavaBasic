package GirlfriendObject;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend[] girlfriends = new Girlfriend[4];

        Girlfriend gf1 = new Girlfriend("忆彤", 18, '女', "游戏");
        Girlfriend gf2 = new Girlfriend("初瑶", 23, '女', "逛街");
        Girlfriend gf3 = new Girlfriend("沐阳", 27, '女', "摄影");
        Girlfriend gf4 = new Girlfriend("芳菲", 32, '女', "运动");

        girlfriends[0] = gf1;
        girlfriends[1] = gf2;
        girlfriends[2] = gf3;
        girlfriends[3] = gf4;

        int sum = 0;
        for (Girlfriend i : girlfriends) {
            sum += i.getAge();
        }
        double avg = (double)sum / girlfriends.length;
        System.out.println("平均年龄：" + avg);

        int count = 0;
        for (Girlfriend i : girlfriends) {
            if (i.getAge() < avg) {
                count++;
                i.girlfriendInfo();
            }
        }
        System.out.println("年龄比平均年龄低的女朋友有" + count + "个");
    }
}
