package teachers_and_students;

public class Student {
    private String newKnowledge;

    public Student(){

    }

    public String learn(){
        this.newKnowledge = "I learnt something new!";
        return newKnowledge;
    }
    public String question(Teacher teacher){
        return teacher.answer();
    }
}
