package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("english");

        ArrayList<String> studentCurrentCourses1 = new ArrayList<>();
        studentCurrentCourses1.add("mathematics");

        Person student1 = new Student("Ømer", passedCourses1, studentCurrentCourses1);

        student1.addCourse("english");
        student1.addCourse("german");

        System.out.println("Student: " + student1.getName() + "\t" + student1 + "\n");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("english");
        canTeach1.add("chemistry");
        canTeach1.add("geography");

        ArrayList<String> teacherCurrentCourses1 = new ArrayList<>();
        teacherCurrentCourses1.add("english");

        Person teacher1 = new Teacher("Bob", canTeach1, teacherCurrentCourses1);

        teacher1.addCourse("biology");
        teacher1.addCourse("english");
        teacher1.addCourse("geography");

        System.out.println("Teacher: " + teacher1.getName() + "\t" + teacher1);
    }
}
