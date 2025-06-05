public class Array {

    public static void main(String[] args) {
//        String [] namesOfMonths = new String[12];
//        namesOfMonths[0] = "January";
//        namesOfMonths[1] = "february";
//        namesOfMonths[2] = "march";
//        namesOfMonths[3] = "april";
//        namesOfMonths[4] = "may";
//        namesOfMonths[5] = "june";
//        namesOfMonths[6] = "july";
//        namesOfMonths[7] = "august";
//        namesOfMonths[8] = "september";
//        namesOfMonths[9] = "october";
//        namesOfMonths[10] = "november";
//        namesOfMonths[11] = "december";
//
//        for (int i = 0; i < namesOfMonths.length; i++) {
//            System.out.print(namesOfMonths[i]);
//            if (i < namesOfMonths.length - 1                ) {
//                System.out.print(", ");
//            } else {
//                System.out.print(".");
//            }
//        }

        int[] numbers = {1,2,3,4,5,6,7};
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
