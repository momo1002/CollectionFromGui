package Polymorphism;

import StudentManagement.*;

public class Undergraduate extends Student{

    private int num_of_courses;
    public  int registerNumber;

    public Undergraduate(){

    }

    public Undergraduate(String name, int id, int courses) {
        super(name, id);
        num_of_courses = courses;
    }

    @Override
    public void study() {
        System.out.println("Undergrad student is studying...");
    }

    public void noSleep(){

    }
}
