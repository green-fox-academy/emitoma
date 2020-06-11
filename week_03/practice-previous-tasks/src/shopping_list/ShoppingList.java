package shopping_list;

import java.util.HashMap;

public class ShoppingList {
    public static void main(String[] args) {

        HashMap<String, Integer> bobsList = new HashMap<String, Integer>() {{
            put("Milk", 3);
            put("Rice", (2));
            put("Eggs", 2);
            put("Cheese",1);
            put("Chicken Breasts", 4);
            put("Apples", 1);
            put("Tomato", 2);
            put("Potato", 2);
        }};
      calc(bobsList);

    }
    public  static void calc(HashMap list){
        HashMap<String, Float> products = new HashMap<String, Float>() {{
            put("Milk", (float) 1.07);
            put("Rice", (float) 1.59);
            put("Eggs", (float) 3.14);
            put("Cheese", (float) 12.60);
            put("Chicken Breasts", (float) 9.40);
            put("Apples", (float) 2.31);
            put("Tomato", (float) 2.58);
            put("Potato", (float) 1.75);
            put("Onion", (float) 1.10);
        }};
        System.out.println(products.entrySet());
        System.out.println(products.values());
        System.out.println(products.get("Milk") * 3);

        //total price
        // more of a product
    }
}
