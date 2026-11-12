package Java_session_10;

public class InheritancePrep {

    // OOP'S
    // what are the piller if OOP'S
    // 1. Inheritance
    // 2. Polymorphism
    // 3. Abstraction
    // 4. Encapsulation

    // use of oop's
    // --> Redable
    // --> Scalable
    // --> Easy

    // Inheritance


}

class MyParent{

    int a = 10 ;
    int b = 20;
    String behaviour;
    String car;

    public void Behaviour(){
        behaviour = "Polite";
    }
    public void car(){
        car = "Sedan";
    }
}

class Child extends MyParent {

    public static void main(String[] args) {
        Child mychild1 = new Child();
        Child mychild2 = new Child();


        mychild1.car();
        System.out.println(mychild1.car);
        Child mychild = new Child();
    }

    // Heap
    // new --> JVM --> Memory --> Create new block of space --> Assign the value to that block
    // X00000 : mychild;
    // X00001 : Child ( value )
    // X00001 : value ;
    // stack : mychild1
    // stack : mychild2;

    // what is class and object's

    // Types of inheritance in java
    /* 1. Single inheritance */
    // 2. Multi-level inheritance
    // 3. Multiple inheritance
    // 4. Hybrid inheritance
    // 5. Hierarchical inheritance

    // Single inheritance
    // A ( class ) --> extends --> B ( child class )

    // Multi-level inheritance
    // class A --> extends --> B class --> extends --> C class extends C

    // Hierarchical inheritance
    // Class A ( parent )
    // --> extends --> Class C extends A
    // --> extends --> Class D extends A
    // --> extends --> Class E extends A
    // Shared access


    class A {
        int a;
    }
    class B extends A{
        public void main(String[] args) {
            B b = new B();
            System.out.println(b.a);
        }
    }
    class C extends  B {
        public void main(String[] args) {
            System.out.println();
        }
    };



}


