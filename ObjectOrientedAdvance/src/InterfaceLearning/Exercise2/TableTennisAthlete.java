package InterfaceLearning.Exercise2;

public class TableTennisAthlete extends Athlete implements Skill {
    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
