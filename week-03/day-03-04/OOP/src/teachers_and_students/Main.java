package teachers_and_students;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        System.out.println(teacher.teach(student));
        System.out.println(student.question(teacher));
    }
}
