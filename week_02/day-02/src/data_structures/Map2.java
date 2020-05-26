package data_structures;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Map2 {
    public static void main(String[] args) {
//        HashMap<String, String> secondMap = (HashMap<String, String>) Map.ofEntries(
//            entry("978-1-60309-452-8", "A Letter to Jo"),
//            entry("978-1-60309-459-7", "Lupus"),
//            entry("978-1-60309-444-3", "Red Panda and Moon Bear"),
//            entry("978-1-60309-461-0", "The Lab"));
        HashMap<String, String> myMap = new HashMap() {{
            put("978-1-60309-452-8", "A Letter to Jo");
            put("978-1-60309-459-7", "Lupus");
            put("978-1-60309-444-3", "Red Panda and Moon Bear");
            put("978-1-60309-461-0", "The Lab");
        }};

        for (Map.Entry<String, String> item : myMap.entrySet()){
            System.out.println(item.getValue() + " (ISBN: " + item.getKey() +")");
        }

        myMap.remove("978-1-60309-444-3");
        System.out.println(myMap);
        myMap.values().remove("The Lab");
        System.out.println(myMap);

        myMap.put("978-1-60309-450-4","They Called Us Enemy");
        myMap.put("978-1-60309-453-5","Why Did We Trust Him?");
        System.out.println(myMap.get("478-0-61159-424-8"));




    }

    ;
}

