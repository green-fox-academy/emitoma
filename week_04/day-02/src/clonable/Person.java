package clonable;

public class Person {
    protected String name;
    protected int age;
    protected String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + specIntroduce() + ".");
    }

    public String specIntroduce() {
        return "";
    }

    public void getGoal() {
        System.out.println("My goal is: " + specGoal());
    }

    public String specGoal() {
        return "Live for the moment.";
    }
}
