package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;
    private Pirate captain;

    //Constructor
    public Ship() {
        this.crew = new ArrayList<>();
    }

    //getters/setters
    public void setCaptain(Pirate captain) {
        this.captain = captain;
    }

    //methods
    public void fillship(Pirate pirate) {
        crew.add(pirate);
    }
    public int countAlive(){
        int aliveCounter = 0;
        for (Pirate pirate : crew) {
            if (!pirate.isDead()) {
                aliveCounter++;
            }
        }
        return aliveCounter;
    }

    public String toString() {

        return "He is the captain, " + this.captain + "\n" + "Number of alive pirates in the crew: " + countAlive();
    }

    //battle
    public boolean battle(Ship ship) {
        Random random = new Random();

        // Calculate score:  Number of Alive pirates in the crew - Number of consumed rum by the captain
        int ship1 = this.crew.size();
        int ship2 = ship.crew.size();

        int calculatedScore1 = ship1 - this.captain.getRumCounter();
        int calculatedScore2 = ship2 - ship.captain.getRumCounter();

        //find winner
        if (calculatedScore1 > calculatedScore2) {

            int ship1Wins = random.nextInt(ship1 + 1);
            //call drinkSomeRum() this many times
            for (int i = 0; i < ship1Wins; i++) {
                this.captain.drinkSomeRum();
                this.crew.get(i).drinkSomeRum();
            }

            int ship2Losing = random.nextInt(ship2);
            for (int i = 0; i < ship2Losing; i++) {
                ship.crew.get(i).die();
            }
            //call die() this many times
            return true;
        } else {
            int ship2Wins = random.nextInt(ship2 + 1);
            //call drinkSomeRum() this many times
            for (int i = 0; i < ship2Wins; i++) {
                ship.captain.drinkSomeRum();
                ship.crew.get(i).drinkSomeRum();
            }

            int ship1Losing = random.nextInt(ship1);
            //call die() this many times
            for (int i = 0; i < ship1Losing; i++) {
                this.crew.get(i).die();
            }
            return false;
        }

    }

}
