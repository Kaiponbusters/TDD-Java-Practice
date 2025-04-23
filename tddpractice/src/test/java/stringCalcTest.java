import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.kaiponbusters.stringCalc;

public class stringCalcTest {
    private stringCalc stringcalc;
    // @BeforeEach
    // public void stringCalcTestInit() {
    //     stringcalc = new stringCalc();
    // }
    //関数が単純なユーティリティ関数なので静的メソッドは静的に呼び出す

    @Test
    void inputEmptyStringReturnZero() {
        int result = stringCalc.stringCalc("");
        assertEquals(0,result);
    }
    @Test
    void shouldReturnOneWhenInputStringOne() {
        int result = stringCalc.stringCalc("1");
        assertEquals(1, result);
    }
    //配列を作る→数値だけを取り出す？
    //カンマでセパレートしてint型として取り出す
    @Test
    void shouldReturnThreeWhenInputStringIncludeOneConmma() {
        int result = stringCalc.stringCalc("1,2");
        assertEquals(3, result);
    }
    @Test
    void shouldReturnSixWhenInputIncludeConmmaLineBreak() {
        int result = stringCalc.stringCalc("1,2\n3");
        assertEquals(6, result);
    }
    @Test
    void shouldReturn321WhenInputIncludeTwoConmma() {
        int result = stringCalc.stringCalc("1,20,300");
        assertEquals(321, result);
    }
    @Test
    void shouldReturnErrorWhenInputOneNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringCalc.stringCalc("-1");
        });

        assertEquals("負の数は対応していません", exception.getMessage());
    }
}
