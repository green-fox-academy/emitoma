package aircraft_carrier;

public class Aircraft {
    private int maxAmo;
    private int amoStorage;
    private int baseDamage;
    private int allDamage;
    private String type;



    public Aircraft() {


    }


    public int getMaxAmo() {
        return maxAmo;
    }

    public void setMaxAmo(int maxAmo) {
        this.maxAmo = maxAmo;
    }

    public int getAmoStorage() {
        return amoStorage;
    }

    public void setAmoStorage(int amoStorage) {
        this.amoStorage = amoStorage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAllDamage() {
        return allDamage;
    }

    public void setAllDamage(int allDamage) {
        this.allDamage = allDamage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //methods

    public int fight() {
        this.allDamage = this.baseDamage * this.amoStorage;
        this.amoStorage = 0;
        return this.allDamage;
    }

    public int refill(int number) {
        if (number >= this.maxAmo) {
            this.amoStorage += this.maxAmo;
        } else {
            this.amoStorage += number;
        }
        int diff = number - maxAmo;
        return diff;
    }



    public void getStatus() {
        System.out.println("Type " + type + ", Ammo: " + amoStorage + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage);
    }

    public boolean isPriority() {
        return true;
    }
}
