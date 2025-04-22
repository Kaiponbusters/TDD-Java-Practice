import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.kaiponbusters.FizzBuzz;

class FizzBuzzTest {
    @Test
    void shouldReturnOneWhenInputIsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.fizzBuzz(1);

        assertEquals("1", result);
    }
    @Test
    void shouldReturnFizzWhenInputIsThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz",result);
    }
    @Test
    void shouldReturnBuzzWhenInputIsFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }
    @Test
    void shouldReturnFizzBuzzWhenInputFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    void shouldReturnFizzBuzzWhenInputZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(0);
        assertEquals("0", result);
    }
 }