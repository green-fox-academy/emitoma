package the_garden_app;

public class Main {
    public static void main(String[] args) {
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");

        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        Garden tinyGarden = new Garden();

        tinyGarden.addFlower(yellowFlower);
        tinyGarden.addFlower(blueFlower);
        tinyGarden.addTree(purpleTree);
        tinyGarden.addTree(orangeTree);


        tinyGarden.gardenState();
        System.out.println(yellowFlower.waterAmount);
        System.out.println(blueFlower.waterAmount);
        System.out.println(purpleTree.waterAmount);
        System.out.println(orangeTree.waterAmount);

        tinyGarden.waterPlants(100);
        tinyGarden.gardenState();
        System.out.println(yellowFlower.waterAmount);
        System.out.println(blueFlower.waterAmount);
        System.out.println(purpleTree.waterAmount);
        System.out.println(orangeTree.waterAmount);

        tinyGarden.waterPlants(10);
        tinyGarden.gardenState();
        System.out.println(yellowFlower.waterAmount);
        System.out.println(blueFlower.waterAmount);
        System.out.println(purpleTree.waterAmount);
        System.out.println(orangeTree.waterAmount);


    }
}
