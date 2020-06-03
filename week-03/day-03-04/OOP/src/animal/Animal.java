package animal;

public class Animal {
    private int hunger = 0;
    private int thirst = 0;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        this.hunger--;
        System.out.println("Hunger level is: " + hunger);
    }

    public void drink() {
        this.thirst--;
        System.out.println("Thirst level is: " + thirst);
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        System.out.println("After playing, hunger level is: " + hunger + " and thirst level is:" + thirst);
    }

}
