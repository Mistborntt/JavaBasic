package StringExpansion;

public class PhoneNumberBlock {
    public static void main(String[] args) {
        String phoneNumber = "18810535825";
        String mask = maskPhoneNumber(phoneNumber);
        System.out.println(mask);

    }

    public static String maskPhoneNumber(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
    }
}
