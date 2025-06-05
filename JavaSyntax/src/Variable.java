public class Variable {

    public static void main(String[] args) {
        int days = 10000;
        int year = 365;
        int month = 30;
        int day = 1;

        System.out.println(days/year);
        System.out.println(days%year/month);
        System.out.println(days%year%month/day);
    }
}
