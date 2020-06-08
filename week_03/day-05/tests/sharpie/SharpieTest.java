package sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    @Test
    public void useUpAllink() {
        Sharpie blueSharpie = new Sharpie("blue", (float) 5.5);
        for (int i = 0; i <= blueSharpie.getInkAmount(); i++) {
            blueSharpie.use();
        }
        assertEquals(0, blueSharpie.getInkAmount());
    }




}