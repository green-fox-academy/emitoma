package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
//    Create a Farm class
//    it has list of Animals
//                    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal
    private List<Animal> animals;
    private  int freeSlots;

    public Farm (){
        this.animals = new ArrayList<>();
    }
    public Farm(int freeSlots){
        this.freeSlots = freeSlots;
    }

    public void add(Animal animal){
        animals.add(animal);
    }
    public void breed(){
        //if theres place for it, it crates a nem animal
    }
    public void slaughter(){
        int initHunger = 50;
        for (Animal animal : animals){
            if (animal.getHunger() < initHunger){
                animals.remove(animal);
            }
        }
    }

}
