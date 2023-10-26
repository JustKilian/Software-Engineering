import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AgeCalculatorTest {

    @Test
    void calculateAge() {
        assertEquals(23, AgeCalculator.calculateAge(new Date(2000, 4, 5)));
        assertEquals(22, AgeCalculator.calculateAge(new Date(2000, 11, 31)));
        assertEquals(23, AgeCalculator.calculateAge(new Date(2000, 1, 1)));
    }
}