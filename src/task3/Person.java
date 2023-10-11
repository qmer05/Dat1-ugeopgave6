package task3;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public abstract boolean addCourse(String course);

    public String toString(){
        return name;
    }
}
