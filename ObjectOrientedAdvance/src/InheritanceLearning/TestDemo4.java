package InheritanceLearning;

public class TestDemo4 {
    public static void main(String[] args) {
        S son = new S();
        son.ziShow();
    }
}


// 继承中，成员变量的访问特点
class F {
    String name = "fu";
}

class S extends F {
    String name = "zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
