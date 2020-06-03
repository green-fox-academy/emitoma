package doable_homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        Create 5 trees
//        Store the data of them in variables in your program
//        for every tree the program should store its'
//        type
//        leaf color
//        age
//        sex
//        you can use just variables, or lists and/or maps
        HashMap<String, String> tree1 = new HashMap<>() {{
            put("type", "apple");
            put("leaf color", "green");
            put("age", "5");
            put("sex", "female");
        }};
        HashMap<String, String> tree2 = new HashMap<>() {{
            put("type", "pear");
            put("leaf color", "green");
            put("age", "4");
            put("sex", "female");
        }};
        HashMap<String, String> tree3 = new HashMap<>() {{
            put("type", "guincho purple");
            put("leaf color", "purple");
            put("age", "2");
            put("sex", "male");
        }};
        HashMap<String, String> tree4 = new HashMap<>() {{
            put("type", "beech");
            put("leaf color", "green");
            put("age", "10");
            put("sex", "female");
        }};
        HashMap<String, String> tree5 = new HashMap<>() {{
            put("type", "pine");
            put("leaf color", "green");
            put("age", "100");
            put("sex", "female");
        }};

    }
}
