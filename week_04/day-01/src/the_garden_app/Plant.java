package the_garden_app;

public class Plant {
    protected String color;
    protected double waterAmount;
    private boolean needsWater;
    private int minWater;

    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public Plant() {
        this.color = "green";
        this.waterAmount = 10;
        this.needsWater = false;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public boolean isNeedsWater() {
        return needsWater;
    }

    public void setMinWater(int minWater) {
        this.minWater = minWater;
    }

    public int getMinWater() {
        return minWater;
    }

    public boolean waterPlants() {
        if (waterAmount <= minWater) {
            needsWater = true;
            return needsWater;

        } else {
            needsWater = false;
            return needsWater;

        }
    }
}
