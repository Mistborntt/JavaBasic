package Exercise;

public class Exercise26_FlightTicket {
    public static void main(String[] args) {
        System.out.println(flightTicket(2000, 5, "头等舱"));
    }

    public static double flightTicket(double op, int month, String cabin) {
        double price = op;
        if (cabin.equals("头等舱")) {
            if (month >= 5 && month <= 10) {
                price = op * 0.9;
            } else {
                price = op * 0.7;
            }
        } else {
            if (month >= 5 && month <= 10) {
                price = op * 0.85;
            } else {
                price = op * 0.65;
            }
        }

        return price;
    }
}
