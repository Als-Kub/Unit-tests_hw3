package task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class CheckNumberInIntervalTest {

    @ParameterizedTest
    @ValueSource(ints = {-1203, 0, 1, 2, 3, 24, 25, 76, 97, 100, 101, 120, 3045})
    void checkEvenOddNumber(int number) {
        assertTrue(CheckNumberInInterval.numberInInterval(number));
    }

}