package InheritanceLearning;


public class TestDemo {
    public static void main(String[] args) {
        Cat Ragdoll = new Cat();
        Cat liHua = new Cat();

        Ragdoll.eat();
        Ragdoll.drink();
        Ragdoll.catchMouse();

        liHua.eat();
        liHua.drink();
        liHua.catchMouse();

        Husky husky = new Husky();

        husky.eat();
        husky.drink();
        husky.houseGuarding();
        husky.destructiveBehavior();

        Poodle poodle = new Poodle();

        poodle.eat();
        poodle.drink();
        poodle.houseGuarding();
        poodle.rub();
    }
}
