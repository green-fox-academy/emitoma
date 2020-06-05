package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();

    @Test
    public void sumReturnsTheSum() {

        numbers.add(2);
        numbers.add(2);
        assertEquals(4, sum.sum(numbers));
    }

    @Test
    public void sumWithEmptyList() {
        assertEquals(0, sum.sum(numbers));
    }

    @Test
    public void sumOneElement() {
        numbers.add(5);
        assertEquals(5, sum.sum(numbers));
    }

    @Test
    public void sumWithMultiplyElements() {
        numbers.add(2);
        numbers.add(10);
        numbers.add(20);
        numbers.add(6);
        assertEquals(38, sum.sum(numbers));
    }

    @Test
    public void sumWithNull() {
        numbers.add(null);
        assertThrows(NullPointerException.class, () -> {
            sum.sum(numbers);
        });
    }
}
