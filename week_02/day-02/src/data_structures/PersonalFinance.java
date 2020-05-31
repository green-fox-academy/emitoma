package data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);


        int sum = 0;
        Collections.sort(expenses);
        int cheap = expenses.get(0);
        int expensive = expenses.get(expenses.size() - 1);

        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i);
        }
        int average = sum / expenses.size();
        System.out.println("Total expenses: " + sum);
        System.out.println("The cheapest expense was: " + cheap);
        System.out.println("The most expensive was: " + expensive);
        System.out.println("The average spending: " + average);
    }


}
