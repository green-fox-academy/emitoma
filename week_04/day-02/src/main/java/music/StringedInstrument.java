package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument() {
        this.numberOfStrings = 0;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract public String sound();


}
