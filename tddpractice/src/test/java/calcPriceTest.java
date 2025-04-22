import com.kaiponbusters.calcPrice;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calcPriceTest {
    @Test
    void shouldReturnOneHundredUnitOne() {
        int result = calcPrice.calcPrice(100,1);
        assertEquals(100, result);
    }
    @Test
    //100円のものを10個買ったら1000円だが、10%割引になる
    // (100 * 10) * 0.9 = 900が正しい出力
    void waribikiPriceUnit10() {
        int result = calcPrice.calcPrice(100,10);
        assertEquals(900, result);
    }
    @Test
    void oneUnitPriceZero() {
        int result = calcPrice.calcPrice(0, 1);
        assertEquals(0, result);
    }
    @Test
    void noUnitPriceOneHundred() {
        int result = calcPrice.calcPrice(100, 0);
        assertEquals(0, result);
    }
    @Test
    void waribikiGiriGiri() {
        int result = calcPrice.calcPrice(100, 9);
        assertEquals(900, result);
    }
}
