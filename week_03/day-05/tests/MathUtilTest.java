import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    MathUtil mathUtil;

    @BeforeEach
    public void setup() {
        mathUtil = new MathUtil();
    }

    @Test
    public void addShouldAddTwoNumbersCorrectly() {
        assertEquals(5, mathUtil.add(2, 3));
    }

    @Test
    public void addShouldNotAddTwoNumbersCorectly(){
        assertEquals(5, mathUtil.add(2,2));
    }
    @Test
    public void addShouldGetTheMaxValueIntPlusOne() {
        assertEquals(-2147483648, mathUtil.add(Integer.MAX_VALUE, 1));
    }


}