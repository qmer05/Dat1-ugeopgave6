package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("english");
        passedCourses.add("geography");

        Person student1 = new Student("Ømer", passedCourses);

        student1.addCourse("english");
    }
}
