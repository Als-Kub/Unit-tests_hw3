package task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddCheckTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
        void checkEvenOddNumber(int number) {
            assertTrue(EvenOddCheck.EvenOddNumber(number));
        }
    }