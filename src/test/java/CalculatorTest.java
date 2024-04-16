import calculator.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        var calculator = new Calculator();
        assertEquals(8, calculator.add(3, 5));
        assertEquals(1, calculator.add(0, 1));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtract(){
        var calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-2, calculator.subtract(3, 5));
    }

    @Test
    public void testMultiply(){
        var calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(4, calculator.multiply(-2, -2));
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testDivide(){
        var calculator = new Calculator();
        assertEquals(2.0, calculator.divide(8, 4), 0.001);
        assertEquals(-2.0, calculator.divide(-6, 3), 0.001);
        assertEquals(0.5, calculator.divide(2, 4), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        var calculator = new Calculator();
        calculator.divide(2, 0);
    }
}
