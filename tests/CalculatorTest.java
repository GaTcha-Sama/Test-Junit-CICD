import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(10, Calculator.add(4, 6));
    }
}

