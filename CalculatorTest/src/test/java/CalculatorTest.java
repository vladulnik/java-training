import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.001);
        double expected2 = 150;
        double result2 = calculator.add(100, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void when5AddTo10AsStringThenResult15(){
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test
    void whenInputIncorrectValueThenThrowException(){
        Exception exception = assertThrows(NumberFormatException.class,
                () -> {calculator.add("asdadsd", "5");});
    }

    @Test
    void multiplication() {
        double expected = 10;
        double result = calculator.multiplication(5, 2);
        assertEquals(expected, result, 0.001);
        double expected2 = 40;
        double result2 = calculator.multiplication(4, 10);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void when5multiplication10ThenResult50() {
        double expected = 50;
        double result = calculator.multiplication(5, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when4multiplication10ThenResult40() {
        double expected = 40;
        double result = calculator.multiplication(4, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void division() {
        double expected = 10;
        double result = calculator.division(100, 10);
        assertEquals(expected, result, 0.001);
        double expected2 = 20;
        double result2 = calculator.division(100, 5);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void when100Division10ThenResult10() {
        double expected = 10;
        double result = calculator.division(100, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when100Division5ThenResult20() {
        double expected = 20;
        double result = calculator.division(100, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when30Division3AsStringThenResult10(){
        double expected = 10;
        double result = calculator.division("30", "3");
        assertEquals(expected, result, 0.001);
    }

    @Test
    void whenInputIncorrectValueInDivisionThrowException(){
        Exception exception = assertThrows(Exception.class,
                () -> {calculator.division("dasjkdasd", "dasda");});
    }

    @Test
    void exponentiation() {
        double expected = 100;
        double result = calculator.exponentiation(10);
        assertEquals(expected, result, 0.001);
        double expected2 = 36;
        double result2 = calculator.exponentiation(6);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void when5exponentiationThenResult25(){
        double expected = 25;
        double result = calculator.exponentiation(5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void whenInputIncorrectInExponentiationThenThrowException() {
        Exception exception = assertThrows(Exception.class, () -> {calculator.exponentiation("dsadsd");});
    }
}