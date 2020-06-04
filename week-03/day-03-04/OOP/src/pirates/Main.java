package pirates;

public class Main {
    public static void main(String[] args) {
        Pirate jackSparrow = new Pirate();
        Pirate davyJones = new Pirate();
        Parrot polly = new Parrot("Polly");


        System.out.println(jackSparrow.drinkSomeRum());
        jackSparrow.howsItGoingMate();
        jackSparrow.drinkSomeRum();
        jackSparrow.howsItGoingMate();
        jackSparrow.drinkSomeRum();
        jackSparrow.howsItGoingMate();
        jackSparrow.drinkSomeRum();
        jackSparrow.howsItGoingMate();
        jackSparrow.drinkSomeRum();
        jackSparrow.howsItGoingMate();

        System.out.println(jackSparrow.die());
        jackSparrow.drinkSomeRum();
        jackSparrow.howsItGoingMate();

        jackSparrow.brawl(davyJones);
    }
}
