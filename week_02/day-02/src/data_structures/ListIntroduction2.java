package data_structures;


import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);
        System.out.println(listB);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifriut");
        System.out.println(listA);
        System.out.println(listB);
        if ((listA.size() > listB.size())) {
            System.out.println("ListA is bigger");
        } else {
            System.out.println("ListB is bigger");
        }
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.add("Passion Fruit");
        listB.add("Pomelo"); //I didn't get it yet how to do it in one statement

        System.out.println(listB);
        System.out.println(listA.get(2));


    }
}
