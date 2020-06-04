package pirates;


import java.awt.image.SinglePixelPackedSampleModel;

public class Main {
    public static void main(String[] args) {
        Parrot polly = new Parrot("Polly");
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        Pirate pirate3 = new Pirate();
        Pirate pirate4 = new Pirate();
        Pirate pirate5 = new Pirate();
        Pirate pirate6 = new Pirate();
        Pirate pirate7 = new Pirate();
        Pirate pirate8 = new Pirate();
        Pirate pirate9 = new Pirate();
        Pirate pirate10 = new Pirate();
        Pirate pirate11 = new Pirate();

        //drink rum
        pirate1.drinkSomeRum();
        pirate2.drinkSomeRum();
        pirate5.drinkSomeRum();
        pirate10.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate5.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate7.drinkSomeRum();
        pirate4.drinkSomeRum();
        pirate10.drinkSomeRum();
        pirate8.drinkSomeRum();
        pirate9.drinkSomeRum();
        pirate9.drinkSomeRum();

       // pirate1.howsItGoingMate();

        //figtht someone
        pirate1.brawl(pirate3);
        pirate5.brawl(pirate4);
        pirate2.brawl(pirate8);
        pirate9.brawl(pirate10);


        //get a ship and a crew
        Ship blackPearl = new Ship();

        blackPearl.setCaptain(pirate1);
        blackPearl.fillship(pirate2);
        blackPearl.fillship(pirate3);
        blackPearl.fillship(pirate4);
        blackPearl.fillship(pirate11);
        System.out.println(blackPearl);
        //get another ship
        Ship eros = new Ship();
        eros.setCaptain(pirate9);
        eros.fillship(pirate5);
        eros.fillship(pirate6);
        eros.fillship(pirate7);
        eros.fillship(pirate8);
        eros.fillship(pirate10);
        System.out.println(eros);

        //Battele
        System.out.println(blackPearl.battle(eros));
        System.out.println(blackPearl);
        System.out.println(eros);



    }

}
