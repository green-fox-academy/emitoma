package data_structures;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names);
        names.remove(1);
        for (int i = names.size() - 1; i >= 0 ; i--) {
            System.out.println(names.get(i));
        }
        names.clear();
        System.out.println(names.isEmpty());



    }
}
