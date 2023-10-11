package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("english");

        ArrayList<String> currentCourses1 = new ArrayList<>();
        currentCourses1.add("mathematics");

        Person student1 = new Student("Ømer", passedCourses1, currentCourses1);

        student1.addCourse("english");
        student1.addCourse("german");

        System.out.println(student1);

    }
}
