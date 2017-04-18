package Polymorphism;

/**
 * Created by mnakada on 2017-04-18.
 */
public class DriveStudent {

    public static void main(String[] args) {
        Undergraduate momo = new Undergraduate();
        Graduate gui = new Graduate();
        Student s1 = new Undergraduate();


//        Undergraduate momo = new Undergraduate();
//        Graduate momo = new Graduate();


        useLibrary(momo);
        useLibrary(gui);




    }

    public static String useLibrary(Student person){
        if(person.getClass().equals(Undergraduate.class)) {
            return person.getName() + ((Undergraduate) person).registerNumber + " is using library";
        }else{
            return person.getName() + " is using library";
        }
    }
}
