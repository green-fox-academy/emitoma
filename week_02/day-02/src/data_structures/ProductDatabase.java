package data_structures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>() {{
            put("Eggs", 200);
            put("Milk", 200);
            put("Fish", 400);
            put("Apples", 150);
            put("Bread", 50);
            put("Chicken", 550);
        }};


        int fishPrice = products.get("Fish");

        int highestPrice = products.values().iterator().next();
        int smallestPrice = highestPrice;
        String cheapItem = "";
        String expensiveItem = "";

        int productCounter = 0;

        int sum = 0;

        boolean isPrice125 = false  ;

        for (Map.Entry<String, Integer> product : products.entrySet()) {
            //gets the sum of the prices
            sum += product.getValue();

            //count how many products are under 300
            if (product.getValue() <= 300) {
                productCounter++;
            }

            //Find the most expensive value
            if (product.getValue() >= highestPrice) {
                highestPrice = product.getValue();
            }

            if (product.getValue().equals(highestPrice)) {
                expensiveItem = product.getKey();
            }

            //Finds the cheapest product
            if (product.getValue() < smallestPrice && smallestPrice != 0) {
                smallestPrice = product.getValue();
            }
            if (product.getValue().equals(smallestPrice)) {
                cheapItem = product.getKey();
            }

            //something that's price is 125
            if (product.getValue() == 125) {
                isPrice125 = true;
            }
        }
        int average = sum / products.size();


        System.out.println("The fish is: " + fishPrice);
        System.out.println("The the most expensive product is: " + expensiveItem);
        System.out.println("The average price is: " + average);
        System.out.println("There are " + productCounter + " products that are below 300.");
        System.out.println("There is a product we can buy for exactly 125. " + isPrice125);
        System.out.println("The cheapest item is: " + cheapItem);
    }
}
