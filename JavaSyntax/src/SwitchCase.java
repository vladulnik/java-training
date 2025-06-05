public class SwitchCase {

    public static void main(String[] args) {

        String month = "июнь";

        switch (month){
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("осень");
                break;
        }
    }
}
