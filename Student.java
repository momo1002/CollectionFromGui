package Polymorphism;

public class Student {
    private String name;
    private int std_id;

    public Student(){

    }

    public Student(String n, int id) {
        name = n;
        std_id = id;
    }

    public String getName(){
        return this.name;
    }

    public void study() {
        System.out.println("I am studying.");
    }

}