package InheritanceLearning;

public class TestDemo6 {
    public static void main(String[] args) {
        // 边牧
        BorderCollie bc = new BorderCollie();
        bc.eat();
        bc.drink();
        bc.houseGuarding();
        bc.houseDestroying();

        // 沙皮狗
        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.houseGuarding();

        // 中华田园犬
        ChineseRuralDog crd = new ChineseRuralDog();
        crd.eat();
        crd.drink();
        crd.houseGuarding();
    }
}

class BorderCollie extends Dog{
    @Override
    public void eat() {
        System.out.println("吃饭（吃狗粮）");
    }

    public void houseDestroying() {
        System.out.println("拆家");
    }
}

class SharPei extends Dog{
    @Override
    public void eat() {
        System.out.println("吃饭（吃狗粮、吃骨头）");
    }
}

class ChineseRuralDog extends Dog {
    @Override
    public void eat() {
        System.out.println("吃饭（吃剩饭）");
    }
}
