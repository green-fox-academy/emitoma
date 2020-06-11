package aircraft_carrier;

public class F16 extends Aircraft {
//    public F16( int maxAmo, int amoStorage, int baseDamage) {
//        super( maxAmo, amoStorage, baseDamage);

//    }

    public F16() {
        this.setMaxAmo(8);
        this.setBaseDamage(30);
        this.setType("F16");
    }

    @Override
    public boolean isPriority() {
        return false;
    }


}
