package StringExpansion;

public class SensitiveWordReplacement {
    public static void main(String[] args) {
        String talk = "你玩的真好，以后不要再玩了，tmd";

        String[] dict = {"tmd", "cnm", "byd", "sb", "mlgb"};

        for (String i : dict) {
            talk = talk.replace(i, "***");
        }

        System.out.println(talk);
    }
}
