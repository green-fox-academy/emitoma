package dice_set;

public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
//        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.getCurrent(5));
//        diceSet.reroll();
//        System.out.println(diceSet.getCurrent());

        //loops through the diceSet and calls the reroll function until the i index of the arraylist isn't 6
        for (int i = 0; i < 6; i++) {
            do {
               // System.out.println("index: " + i + " " + diceSet.getCurrent(i));
                diceSet.reroll(i);
//                System.out.println("rerolled " + diceSet.getCurrent(i));
            } while (diceSet.getCurrent(i) != 6);
        }

        // diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());
    }
}
