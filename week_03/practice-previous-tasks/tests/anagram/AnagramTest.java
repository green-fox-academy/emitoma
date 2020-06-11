package anagram;

import org.junit.jupiter.api.Test;

import static anagram.Anagram.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void testAnagram() {

        assertTrue(isAnagram("Listen", "SilEnT"));
    }
    @Test
    public void testAnagram2() {

        assertFalse(isAnagram("Kitten", "cat"));
    }
    @Test
    public void testAnagram3() {

        assertTrue(isAnagram("god", "dog"));
    }
    @Test
    public void testAnagram4() {

        assertTrue(isAnagram("123abc", "3A2B1C"));
    }

}