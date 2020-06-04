package pirates;

import java.util.Random;
import java.util.SortedMap;

public class Pirate {
    private int callCounter = 0;
    private boolean passedOut;
    private boolean dead;
    private Parrot parrot;


    public Pirate() {
        passedOut = false;
    }

    public int drinkSomeRum() {
        if (dead) {
            System.out.println("he's dead");
        }

        this.callCounter++;
        return callCounter;
    }

    public void howsItGoingMate() {
        if (dead) {
            System.out.println("he's dead");
        } else {
            passedOut = true;
            if (callCounter <= 4) {
                System.out.println("Pur me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        }
    }

    public boolean die() {
        this.dead = true;
        return dead;
    }

    public void brawl(Pirate pirate) {
        Random random = new Random();
        int chance = random.nextInt(3);

        if (chance == 1) {
            this.die();
            System.out.println("first dead");

        } else if (chance == 2) {
            pirate.die();
            System.out.println("second dead");

        } else {
            this.passedOut = true;
            pirate.passedOut = true;
            System.out.println("both passed out");
        }
    }
}
