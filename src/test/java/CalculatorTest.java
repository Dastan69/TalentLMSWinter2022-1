import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void addTwoNumbersTest(){


        assertEquals(Calculator.add(2,2),4);
        assertEquals(Calculator.add(2,2),3);
    }
    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertTrue(SomeClass.isFunny(false));
        assertFalse(false);
    }

    @Test
    public void test123(){
        assertNotNull(null);
    }


}
