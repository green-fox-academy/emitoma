package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpies;

    public SharpieSet(){
        this.sharpies = new ArrayList<>();
    }
    public void add(Sharpie sharpie){
        sharpies.add(sharpie);
    }
    public int countUsable(){
        int counter = 0;
        for (Sharpie sharpie: this.sharpies){
            if(sharpie.getInkAmount() != 0){
                counter++;
            }
        }
        return counter;
    }
    public void removeTrash(){
        for (Sharpie sharpie: this.sharpies){
            if (sharpie.getInkAmount() == 0){
                this.sharpies.remove(sharpie);
            }
        }
    }


    //    Reuse your Sharpie class
//    Create SharpieSet class
//    it contains a list of Sharpie
//      countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies


}
