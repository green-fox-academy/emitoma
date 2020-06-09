package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super();
        setNumberOfStrings(4);
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + sound() + ".");
    }
}
