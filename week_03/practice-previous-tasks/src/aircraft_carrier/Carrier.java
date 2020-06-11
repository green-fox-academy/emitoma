package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> carrier;
    private int ammoStore;
    private int healthPoints;
    private int totalDamage;


    public Carrier(int ammoStore, int healthPoints) {
        this.carrier = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoints;
    }

    //    getters and setters
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAmmoStore() {
        return ammoStore;
    }

    public void setAmmoStore(int ammoStore) {
        this.ammoStore = ammoStore;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill() {

        try {

            for (Aircraft aircraft : this.carrier) {
                aircraft.refill(1);
            }


        } catch (Exception e) {
            System.out.println("Not enough ammo in the storage.");
        }

    }

    public void allstatus() {
        for (Aircraft aircraft : this.carrier) {
            aircraft.getStatus();
        }
        ;

    }

    public void getStatus() {
        System.out.println("HP: " + healthPoints + ", Aircraft count: " + carrier.size() +
                ", Ammo Storage: " + ammoStore + ", Total damage: " + totalDamage);
        allstatus();

    }
}
