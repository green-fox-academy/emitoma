package greenfox_inheritance;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public String specIntroduce() {
        return " who represents " + company + " and hired " + hiredStudents + " students so far";
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public String specGoal() {
        return "Hire brilliant junior software developers.";
    }
}
