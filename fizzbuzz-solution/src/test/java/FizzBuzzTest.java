import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturnOneWhenPassedOne() {
        assertEquals("1", FizzBuzz.getValue(1));
    }

    @Test
    public void shouldReturnTwoWhenPassedTwo() {
        assertEquals("2", FizzBuzz.getValue(2));
    }

    @Test
    public void shouldReturnFizzWhenPassedThree() {
        assertEquals("Fizz", FizzBuzz.getValue(3));
    }

    @Test
    public void shouldReturnBuzzWhenPassedFive() {
        assertEquals("Buzz", FizzBuzz.getValue(5));
    }

    @Test
    public void shouldReturnFizzWhenPassedMultiplesOfThree() {
        assertEquals("Fizz", FizzBuzz.getValue(6));
        assertEquals("Fizz", FizzBuzz.getValue(9));
        assertEquals("Fizz", FizzBuzz.getValue(12));
        assertEquals("Fizz", FizzBuzz.getValue(87));
    }

    @Test
    public void shouldReturnBuzzWhenPassedMultiplesOfFive() {
        assertEquals("Buzz", FizzBuzz.getValue(10));
        assertEquals("Buzz", FizzBuzz.getValue(20));
        assertEquals("Buzz", FizzBuzz.getValue(50));
    }

    @Test
    public void shouldReturnFizzBuzzWhenPassedMultiplesOfBothThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.getValue(15));
        assertEquals("FizzBuzz", FizzBuzz.getValue(30));
        assertEquals("FizzBuzz", FizzBuzz.getValue(45));
    }

}
