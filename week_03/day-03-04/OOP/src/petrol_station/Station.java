package petrol_station;

public class Station {
    private int gasAmount;

    public Station() {
        this.gasAmount = 1000;
    }


    public int getGasAmount() {
        return gasAmount;
    }

    public int refill(Car car) {
        this.gasAmount -= car.getCapacity();
        car.setGasAmount(car.getCapacity());
        return gasAmount;
    }
}
