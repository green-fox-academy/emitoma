import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {


    @Test
    public void compareLengthTest(){
        assertFalse(Main.anagramFinder("potter", "dumbledore"));
    }
    @Test
    public void sameCharsTest(){
       assertEquals( false,Main.anagramFinder("potter", "malfoy"));
    }
}