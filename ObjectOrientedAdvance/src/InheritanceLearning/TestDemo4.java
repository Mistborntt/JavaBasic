package InheritanceLearning;

public class TestDemo4 {
    public static void main(String[] args) {
        S son = new S();
        son.ziShow();
    }
}


// 继承中，成员变量的访问特点
class F {
    String name = "Fu";
    String hobby = "喝茶";
}

class S extends F {
    String name = "Zi";
    String game = "吃鸡";

    public void ziShow() {
        // Zi
        System.out.println(name);
        System.out.println(this.name);

        // Fu
        System.out.println(super.name);

        // 喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);

        // 吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}
