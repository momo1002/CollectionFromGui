package Polymorphism;

import StudentManagement.*;

public class Graduate extends Student {

    private String research_area;

    public Graduate(){

    }

    public Graduate(String name, int id, String area) {
        super(name, id);
        research_area = area;
    }

    @Override
    public void study() {

        System.out.println("Graduate student is studying...");
    }
}