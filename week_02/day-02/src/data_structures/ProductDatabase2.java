package data_structures;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>() {{
            put("Eggs", 200);
            put("Milk", 200);
            put("Fish", 400);
            put("Apples", 150);
            put("Bread", 50);
            put("Chicken", 550);
        }};

        int productCounterLess = 0;

        int productCounterMore = 0;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            //products less than 201 - name
            if (product.getValue() <= 201) {
                System.out.println("Products cost less than 201: " + product.getKey());
            }
            // products more than 150 - name+price
            if (product.getValue() >= 150) {
                System.out.println("Products cost more than 150: " + product.getValue() + " " + product.getKey());
            }
        }


    }
}
