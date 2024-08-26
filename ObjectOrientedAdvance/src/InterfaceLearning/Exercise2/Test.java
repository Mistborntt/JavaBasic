package InterfaceLearning.Exercise2;

public class Test {
    public static void main(String[] args) {
        TableTennisAthlete ta = new TableTennisAthlete("樊振东", 27);
        TableTennisCoach tc = new TableTennisCoach("刘国梁", 48);

        BasketballAthlete ba = new BasketballAthlete("郭艾伦", 31);
        BasketballCoach bc = new BasketballCoach("杨鸣", 39);

        System.out.printf("%s, %d\n", ta.getName(), ta.getAge());
        ta.learn();
        ta.speakEnglish();

        System.out.printf("%s, %d\n", tc.getName(), tc.getAge());
        tc.work();
        tc.speakEnglish();

        System.out.printf("%s, %d\n", ba.getName(), ba.getAge());
        ba.learn();

        System.out.printf("%s, %d\n", bc.getName(), bc.getAge());
        bc.work();
    }
}
