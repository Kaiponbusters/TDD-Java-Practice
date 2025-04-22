import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.kaiponbusters.sumUniquePositives;

public class sumUniquePositivesTest {
	@Test
    void shouldReturnOneWhenInputIsOne() {
        sumUniquePositives sumuniquePositives = new sumUniquePositives();
        int[] arg = {1};
        int result = sumuniquePositives.sumUniquePositives(arg);
        assertEquals(1, result);
    }
    @Test
    void shouldReturnSixWhenInputOneTwoThree() {
        sumUniquePositives sumuniquePositives = new sumUniquePositives();
        int[] arg = {1,2,3};
        int result = sumuniquePositives.sumUniquePositives(arg);
        assertEquals(6, result);
    }
    @Test
    void shouldReturnSixWhenInputNegativeNumber() {
        sumUniquePositives sumuniquePositives = new sumUniquePositives();
        int[] arg = {1,2,3,-3};
        int result = sumuniquePositives.sumUniquePositives(arg);
        assertEquals(6, result);
    }
    @Test
    void numberIsNotUnique() {
        sumUniquePositives sumuniquePositives = new sumUniquePositives();
        int[] arg = {1,1,2,2,3,3};
        int result = sumuniquePositives.sumUniquePositives(arg);
        assertEquals(6, result);
    }
}
