package task3;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course) || currentCourses.contains(course)){
            System.out.println("Already enrolled or passed " + course + " course");
            return false;
        } else {
            System.out.println("Succesfully enrolled " + course + " course.");
            currentCourses.add(course);
            return true;
        }
    }

    public String toString(){
        return "Passed courses: " + passedCourses + "\tEnrolled courses: " + currentCourses;
    }
}