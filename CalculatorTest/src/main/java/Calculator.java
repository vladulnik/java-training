import java.sql.PreparedStatement;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(String  a, String  b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double division(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return (double) numA / numB;
    }

    public double exponentiation(double a) {
        return a * a;
    }

    public double exponentiation(String a){
        int numA = Integer.parseInt(a);
        return numA * numA;
    }
}
