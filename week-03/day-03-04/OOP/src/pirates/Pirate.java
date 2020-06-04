package pirates;

import java.util.Random;

public class Pirate {
    private String name;
    private int rumCounter = 0;
    private boolean passedOut;
    private boolean dead;
    private Parrot parrot;

    //constructor
    public Pirate() {
        passedOut = false;
    }

    public Pirate(String name) {
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }
    public int getRumCounter(){
        return this.rumCounter;
    }

    public boolean isDead() {
        return dead;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    public int drinkSomeRum() {
        if (dead) {
            System.out.println("he's dead");
        }
        this.rumCounter++;
        return rumCounter;
    }

    public void howsItGoingMate() {
        if (dead) {
            System.out.println("he's dead");
        }
        if (rumCounter <= 4) {
            System.out.println("Pur me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
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
            System.out.println("First pirate is dead.");

        } else if (chance == 2) {
            pirate.die();
            System.out.println("Second pirate is dead.");

        } else {
            this.passedOut = true;
            pirate.passedOut = true;
            System.out.println("Both passed out.");
        }
    }

    public String toString() {
        String state = "";
        if (rumCounter != 0 && rumCounter <= 4) {
            state = "he drank some rum.";
        } else if (passedOut) {
            state = "he passed out.";
        } else {
            state = "he's dead.";
        }
        return state;
    }
}
