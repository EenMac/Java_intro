import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void hasAdd() {
        assertEquals(30, calculator.add(20, 10));
    }
    @Test
    public void hasSubtract(){
        assertEquals(30, calculator.subtract(40, 10));
    }
    @Test
    public void hasMultiply(){
        assertEquals(40, calculator.multiply(10, 4));
    }
    @Test
    public void hasDivide(){
        assertEquals(10.00, calculator.divide(20.00, 2.00), 00);
    }
}
