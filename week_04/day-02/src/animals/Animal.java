package animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected String color;

    abstract String getName();

    abstract void breed();

    abstract String makeSound();

}
