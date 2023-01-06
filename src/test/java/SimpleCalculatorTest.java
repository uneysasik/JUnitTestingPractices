import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
//        assertNotEquals();
        assertTrue(calculator.add(2,2)==4);
//        assertFalse();
//        assertNull();
//        assertNotNull();
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));

    }
}