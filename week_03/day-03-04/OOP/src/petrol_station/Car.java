package petrol_station;

public class Car {
    private int capacity = 0;
    private int initCapacity;
    private int gasAmount = 0;
    private int initGasAmount;

    public Car() {
        this.capacity = 100;
        this.initCapacity = capacity;
        this.gasAmount = 0;
        this.initGasAmount = gasAmount;
    }

    public Car(int capacity, int gasAmount) {
        this.capacity = capacity;
        this.initCapacity = capacity;

        this.gasAmount = gasAmount;
        this.initGasAmount = gasAmount;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

}
