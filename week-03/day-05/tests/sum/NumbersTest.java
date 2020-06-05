package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    public void sumReturnsTheSum() {
        Numbers myNums = new Numbers();
        myNums.add(2);
        myNums.add(2);
        myNums.add(2);

        assertEquals(6, myNums.sum(myNums));

    }

    @Test
    public void sumEmpty() {
        Numbers myNums = new Numbers();
        assertEquals(0, myNums.sum(myNums));
        assertTrue(myNums.isEmpty(myNums));
    }

    @Test
    public void sumOneElement() {
        Numbers myNums = new Numbers();
        myNums.add(5);
        assertEquals(5, myNums.sum(myNums));
        assertFalse(myNums.isEmpty(myNums));
    }
//    @Test
//    public void sumNull(){
//        Numbers myNums = new Numbers();
//
//    }

}