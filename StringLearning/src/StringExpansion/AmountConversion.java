package StringExpansion;

public class AmountConversion {
    public static final String CNUPPERCASE = "零壹贰叁肆伍陆柒捌玖";
    public static final String UNIT = "佰拾万仟佰拾元";

    public static void main(String[] args) {
        int amount = 2135;
        String s = ChineseUpercase(amount);
        System.out.println(s);

    }

    public static String ChineseUpercase(int amount) {
        StringBuilder str = new StringBuilder(14);

        int count = 0;
        while (amount > 0) {
            int index = amount % 10;
            str.append(CNUPPERCASE.charAt(index));

            amount /= 10;
            count++;
        }

        str.append(String.valueOf(CNUPPERCASE.charAt(0)).repeat(Math.max(0, (7 - count))));
        str.reverse();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(UNIT.charAt(i));
        }

        return result.toString();
    }
}
