package fleet_of_things;

import java.util.ArrayList;

public class Fleet {

    private ArrayList<Thing> things;

    public Fleet() {
        things = new ArrayList<>(); //constructor, makes arraylist
    }

    public void add(Thing thing) { // method that add things to the arraylist
        things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < things.size(); i++) {
            result += (i + 1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}