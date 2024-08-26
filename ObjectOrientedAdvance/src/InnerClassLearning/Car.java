package InnerClassLearning;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(this.carName);

        Engine e = new Engine();
        e.engineName = "W12双涡轮增压发动机";
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
        }
    }
}
