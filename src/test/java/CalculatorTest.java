import calculator.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(3, 5));
        assertEquals(1, calculator.add(0, 1));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-2, calculator.subtract(3, 5));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(4, calculator.multiply(-2, -2));
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(8, 4), 0.001);
        assertEquals(-2.0, calculator.divide(-6, 3), 0.001);
        assertEquals(0.5, calculator.divide(2, 4), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        Calculator calculator = new Calculator();
        calculator.divide(2, 0);
    }
}
