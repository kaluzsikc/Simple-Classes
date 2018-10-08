import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator(4,2);

    }
    
    @Test
    public void canAdd() {
        assertEquals(6, calculator.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract());
    }

    @Test
    public void canMultiply() {
        assertEquals(8, calculator.multiply());
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator.divide());
    }



}
