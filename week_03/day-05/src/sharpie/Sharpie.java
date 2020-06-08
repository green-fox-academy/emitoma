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

    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    public void use() {
        if (inkAmount >= 0) {
            this.inkAmount -= 10.0;
        }
    }

}
