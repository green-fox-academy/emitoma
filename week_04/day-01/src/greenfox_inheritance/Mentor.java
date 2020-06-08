package greenfox_inheritance;

public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this.level = "intermediate";
    }

    @Override
    public String specIntroduce() {
        return " " + level + " mentor";
    }

    @Override
    public String specGoal() {
        return "Educate brilliant junior software developers.";
    }
}
