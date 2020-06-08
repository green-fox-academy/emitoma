package the_garden_app;

public class Tree extends Plant {
    private double waterAbsorption;

    public Tree(String color) {
        super(color);
        this.waterAbsorption = 0.40;
        this.setMinWater(10);

    }

    public Tree() {
        this.waterAbsorption = 0.40;
        this.setMinWater(10);
    }

    public double getWaterAbsorption() {
        return waterAbsorption;
    }


    @Override
    public double getWaterAmount() {
        return super.getWaterAmount();
    }


}
