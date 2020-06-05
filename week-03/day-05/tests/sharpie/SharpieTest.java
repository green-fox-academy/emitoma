package sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    @Test
    public void useShouldLowerInkAmount() {
        Sharpie blueSharpie = new Sharpie("blue", (float) 5.5);
//        blueSharpie.use();
//        assertEquals(95, blueSharpie.getInkAmount());
        for (int i = 0; i <= blueSharpie.getInkAmount(); i++) {
            blueSharpie.use();
        }
        assertEquals(0, blueSharpie.getInkAmount());
    }


}