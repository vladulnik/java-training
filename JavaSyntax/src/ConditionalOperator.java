public class ConditionalOperator {

    public static void main(String[] args) {

        boolean isDay = false;
        boolean goodWeather = true;
        if (isDay && goodWeather) {
            System.out.println("go for a walk!");
        }
        if (isDay && goodWeather == false) {
            System.out.println("read a book!");
        }
        if (isDay == false) {
            System.out.println("nothing");
        }
    }
}
