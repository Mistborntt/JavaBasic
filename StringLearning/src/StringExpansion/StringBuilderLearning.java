package StringExpansion;

public class StringBuilderLearning {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder();

        // 容量
        System.out.println(sb.capacity());

        // 添加元素
        sb.append("Mistborntt");
        sb.append(1106);

        // 长度
        System.out.println(sb.length());

        // 反转
        sb.reverse();

        // 转换String类型
        String result = sb.toString();

        // 打印
        System.out.println(sb);
    }
}
