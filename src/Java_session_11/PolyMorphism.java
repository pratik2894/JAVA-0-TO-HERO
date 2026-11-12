package Java_session_11;

import java.sql.SQLOutput;

public class PolyMorphism {

    // Polymorphism : Polymorphism " Many forms "
    // in-terms of method's / function's
    // one method can behave differently in different classes and this we called as Polymorphism

    // Types of polymorphism
    // 1. Compile-time polymorphism : Method overloading
    // 2. Run-Time polymorphism : Method overriding

    // 1. Compile-time polymorphism
    public static void main(String[] args) {

        PolyMorphism polyMorphism = new PolyMorphism();
        polyMorphism.display("Oled");
        polyMorphism.display(14);

    }

    // Method overloading : defining same method multiple times with same name
    // 1 : parameter should be different
    // 2 : parameter data-types should be different
    // 3 : if parameter data type is same then order of parameter must be different
    // 4 : overloaded methods can have same number of parameters but data type and order must be different

    public void display(String Display){
        System.out.println("This is display of : " + Display );
    }
    public void display(int inch){
        System.out.println("This display is " + inch + " inches");
    }
    public void display(String Display , int inch){
        System.out.println("This display is " + Display + "and size is " + inch);
    }
    public void display(String inch , String Display){
        System.out.println("The display size is " + inch + "Display is " + Display);
    }

}
