package task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String passedCourse) {

        for (String i : passedCourse) {
            System.out.println(i);
        }


        return true;
    }
}
