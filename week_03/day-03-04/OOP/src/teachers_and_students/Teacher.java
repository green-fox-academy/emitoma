package teachers_and_students;

public class Teacher {
    private String answerStudent;

    public Teacher() {
    }

    public String teach(Student student) {
        return student.learn();
    }

    public String answer() {
        this.answerStudent = "I answer my student's question.";
        return answerStudent;
    }
}
