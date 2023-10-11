package task3;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;
    public Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        return true;
    }
}
