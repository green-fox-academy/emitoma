package the_garden_app;

public class Flower extends Plant {
    private double waterAbsorption;

    public Flower(String color) {
        super(color);
        this.waterAbsorption = 0.75;
        this.setMinWater(5);

    }

    public Flower() {
        this.waterAbsorption = 0.75;
        this.setMinWater(5);
    }

    public double getWaterAbsorption() {
        return waterAbsorption;
    }

    @Override
    public double getWaterAmount() {
        return super.getWaterAmount();
    }

    @Override
    public void setWaterAmount(double waterAmount) {
        super.setWaterAmount(waterAmount);
    }

}
