package extentions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    public void testAdd_2and_2is4() {
        assertEquals(4, extension.add(2, 2));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMaxOfThree_second() {
        assertEquals(5, extension.maxOfThree(3, 5, 4));
    }

    @Test
    void testMaxOfThree() {
        assertEquals(4, extension.maxOfThree(3, 4, 1));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testIsVowel_n() {
        assertFalse(extension.isVowel('n'));
    }

    @Test
    void testIsVowel_0() {
        assertFalse(extension.isVowel('!'));
    }

    @Test
    void testIsVowel_A() {
        assertTrue(extension.isVowel('A'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }
    @Test
    void testTranslate_Bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("Bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    void testTranslate_elefant() {
        assertEquals("evelevefavant", extension.translate("elefant"));
    }

    @Test
    void testTranslate_trabant() {
        assertEquals("travabavant", extension.translate("trabant"));
    }

    @Test
    void testTranslate_level() {
        assertEquals("levevevel", extension.translate("level"));
    }
}