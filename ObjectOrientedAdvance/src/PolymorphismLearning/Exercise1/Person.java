package PolymorphismLearning.Exercise1;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog dog) {
            System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的狗\n", this.age, this.name, dog.color, dog.age);
            dog.eat(something);
            dog.lookHome();
        } else if (animal instanceof Cat cat) {
            System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的猫\n", this.age, this.name, cat.color, cat.age);
            cat.eat(something);
            cat.catchMouse();
        } else {
            System.out.println("对象不属于狗或猫！");
        }
    }

//    public void keepPet(Dog dog, String something) {
//        System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的狗\n", this.age, this.name, dog.color, dog.age);
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat, String something) {
//        System.out.printf("年龄为%d岁的%s养了一只%s的%d岁的猫\n", this.age, this.name, cat.color, cat.age);
//        cat.eat(something);
//    }
}
