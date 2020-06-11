package aircraft_carrier;

public class Main {
    public static void main(String[] args) {
        F16 plane1 = new F16();
        F35 plane2 = new F35();
        System.out.println(plane1.getType());
        System.out.println(plane2.getType());
        plane1.getStatus();
        plane2.getStatus();
        System.out.println(plane1.fight());
        System.out.println(plane2.fight());
        System.out.println(plane1.refill(8));
        plane1.getStatus();
        plane2.refill(30);
        plane2.getStatus();
        System.out.println(plane1.fight());
        System.out.println(plane2.fight());
        plane1.getStatus();
        plane2.getStatus();
        System.out.println(plane1.isPriority());
        System.out.println(plane2.isPriority());
    }
}
