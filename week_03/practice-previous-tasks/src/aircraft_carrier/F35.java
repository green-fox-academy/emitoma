package aircraft_carrier;

public class F35 extends Aircraft {
//    public F35( int maxAmo, int amoStorage, int baseDamage) {
//        super( maxAmo, amoStorage, baseDamage);
//    }

    public F35() {
        this.setMaxAmo(12);
        this.setBaseDamage(50);
        this.setType("F35");
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}
