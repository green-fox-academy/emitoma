package counter;

public class Main {
    public static void main(String[] args) {
        Counter firstTry = new Counter();
        firstTry.add();
        firstTry.add(10);
        System.out.println(firstTry.get());
        firstTry.reset();
        System.out.println(firstTry.get());

        Counter secondTry = new Counter(50);
        secondTry.add();
        secondTry.add(10);
        System.out.println(secondTry.get());
        secondTry.reset();
        System.out.println(secondTry.get());
    }
}
