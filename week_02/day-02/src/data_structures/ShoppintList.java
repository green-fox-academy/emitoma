package data_structures;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class ShoppintList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")) {
            System.out.println("We have to buy some milk");
        }else if (shoppingList.contains("bananas")) {
            System.out.println("We need to buy bananas");
        }
        else {
            System.out.println("We don't need milk, or bananas");
        }
    }
}
