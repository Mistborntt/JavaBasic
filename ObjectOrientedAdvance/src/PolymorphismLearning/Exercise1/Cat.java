package PolymorphismLearning.Exercise1;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s的的猫眯着眼睛侧着头吃%s\n", this.age, this.color, something);
    }

    public void catchMouse() {
        System.out.println("逮老鼠");
    }
}
