package ht3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ht3Test {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 0, -4})
    public void testEvenNumber(int number) {
        Ht3 yourObject = new Ht3();
        boolean result = yourObject.evenOddNumber(number);
        assertTrue(result, number + " должно считаться четным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -3, 1})
    public void testOddNumber(int number) {
        Ht3  yourObject = new Ht3 ();
        boolean result = yourObject.evenOddNumber(number);
        assertFalse(result, number + " должно считаться нечетным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 50, 75, 99})
    public void testNumberInIntervalWithinBounds(int number) {
        Ht3 yourObject = new Ht3();
        boolean result = yourObject.numberInInterval(number);
        assertTrue(result, "Число " + number + " должно попадать в интервал (25;100).");
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 24, 101, 170})
    public void testNumberInIntervalOutsideBounds(int number) {
        Ht3 yourObject = new Ht3();
        boolean result = yourObject.numberInInterval(number);
        assertFalse(result, "Число " + number + " не должно попадать в интервал (25;100).");
    }
}

