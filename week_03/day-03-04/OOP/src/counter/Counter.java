package counter;

public class Counter {
    private int counter = 0;
    private int initialValue;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
        this.initialValue = counter;
    }

    public void add(int number) {
        this.counter += number;
        System.out.println(counter);
    }

    public void add() {
        this.counter++;
        System.out.println(counter);
    }

    public int get() {
        return this.counter;
    }

    public int reset() {
        this.counter = this.initialValue;
        return counter;
    }

}
