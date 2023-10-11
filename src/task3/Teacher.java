package task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (currentCourses.contains(course)) {
            System.out.println("Already teaching " + course + ". Course not added.");
            return false;
        } else if(canTeach.contains(course)){
            System.out.println("Succesfully added " + course + " course.");
            currentCourses.add(course);
            return true;
        } else  {
            System.out.println("Can't teach " + course + ". Course not added.");
            return false;
        }
    }

    public String toString(){
        return "Teachable courses: " + canTeach + "\tTeaching courses: " + currentCourses;
    }
}
