package PolymorphismLearning.Exercise1;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s的狗两只前腿死死地抱住%s猛吃\n", this.age, this.color, something);
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
