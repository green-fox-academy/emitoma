package the_garden_app;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Tree> trees = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();

    public Garden() {
    }

    public void addTree(Tree tree) {
        this.trees.add(tree);
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public void gardenState() {
        for (Flower flower : flowers) {
            flower.waterPlants();
            if (flower.isNeedsWater()) {
                System.out.println("The " + flower.color + " Flower needs water.");
            } else {
                System.out.println("The " + flower.color + " Flower doesn't need water.");
            }
        }
        for (Tree tree : trees) {
            tree.waterPlants();
            if (tree.isNeedsWater()) {
                System.out.println("The " + tree.color + " Tree needs water");
            } else {
                System.out.println("The " + tree.color + " Tree doesn't need water");
            }
        }
    }


    public void waterPlants(int water) {
        double dividedWater = water / 2; //because I have 2 lists and I have to come up with something better...
        for (Flower flower : flowers) {
            if (flower.isNeedsWater()) {
                double increaseWaterAmount = flower.getWaterAmount() + dividedWater / this.flowers.size();
                flower.setWaterAmount(increaseWaterAmount * flower.getWaterAbsorption());
            }
        }
        for (Tree tree : trees) {
            if (tree.isNeedsWater()) {
                double increaseWaterAmount = tree.getWaterAmount() + dividedWater / this.trees.size();
                tree.setWaterAmount(increaseWaterAmount * tree.getWaterAbsorption());
            }
        }
    }
}
