package sharpie;

public class Sharpie {
    private String color;
    private float width;
    private float inkAmount = 0;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void Use() {
        this.inkAmount -= 0.6;
        System.out.println(inkAmount);
    }

}
