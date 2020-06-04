package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie blueSharpie = new Sharpie("blue", (float) 5.5);
        Sharpie redSharpie = new Sharpie("red", (float) 3.5);
        Sharpie greenSharpie = new Sharpie("green", (float) 5.5, 0);
        Sharpie blackSharpie = new Sharpie("black", (float) 3.5, 10);
        blueSharpie.Use();
        blueSharpie.Use();
        blueSharpie.Use();
        blueSharpie.Use();

        SharpieSet mySharpies = new SharpieSet();

        mySharpies.add(blueSharpie);
        mySharpies.add(redSharpie);
        mySharpies.add(greenSharpie);
        mySharpies.add(blackSharpie);
        System.out.println(mySharpies.countUsable());
        mySharpies.removeTrash();


    }

}
