package clonable;


public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");
        System.out.println(john.getName());
        System.out.println(john.getAge());


        try {
            Student johnTheClone = (Student) john.clone();
            System.out.println(johnTheClone.getName());
            System.out.println(johnTheClone.getAge());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("ERROR");
        }
    }

}


