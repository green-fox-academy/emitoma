package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> carrier;
    private int ammoStore;
    private int healthPoints;


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

    public void add(Aircraft aircraft){
        carrier.add(aircraft);
    }

    public void fill(){

        try{

            for (Aircraft aircraft : this.carrier){
                aircraft.refill()
            }


        }catch (Exception e){
            System.out.println("Not enough ammo in the storage.");
        }

    }
}
