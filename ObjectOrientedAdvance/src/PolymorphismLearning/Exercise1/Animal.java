package PolymorphismLearning.Exercise1;

public class Animal {
    int age;
    String color;

    public Animal() {

    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("吃" + something);
    }
}
