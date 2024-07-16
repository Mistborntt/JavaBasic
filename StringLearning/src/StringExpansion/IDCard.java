package StringExpansion;

public class IDCard {
    public static void main(String[] args) {
        String idno = "330103200011020718";
        personInfo(idno);
    }

    public static void personInfo(String idno) {
        String year = idno.substring(6, 10);
        String month = idno.substring(10, 12);
        String day = idno.substring(12, 14);

        int genderDigit = idno.charAt(16) - 48;
        String gender = "";
        if (genderDigit % 2 == 1) {
            gender = "男";
        } else {
            gender = "女";
        }


        System.out.println("出生日期：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别：" + gender);
    }
}
