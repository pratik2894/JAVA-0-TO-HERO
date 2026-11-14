package Java_session_12;

public abstract class Abstraction {
    // what is abstraction ??
    // Hiding the internal implementation of the methods and showing only useful details to user
    // How we can achieve abstraction ??
    // 1. Abstract class --> this class solves the Diamond problem
    // 2. interfaces --> This can also solve the Diamond problem

    // Rules of abstract class
    // 1. Abstract class can contain concrete method's
    // 2. Abstract class can contain only method definition
    // 3. Abstract class can contain static method's
    // 4. Declared with the abstract keyword.
    // 5. Cannot be instantiated (no objects). : Abstraction abstact = new Abstract();
    // 6. A class with even one abstract method must be declared abstract.
    // 7. A subclass must implement all abstract methods, or be declared abstract itself
    // 8. A class can extend only one abstract class
//     9 . Can have instance variables, static variables and constants (any access modifier).
//    10.  Can have static methods, final methods and main(). A main method inside an abstract class works, since it needs no object.
//    11. Can have any access modifier on methods (public, protected, default). Unlike interfaces, they are not forced to be public.

//     Below are the Restrictions on abstract methods
//    12. An abstract method cannot be private, because subclasses couldn’t see or override it.
//    13. An abstract method cannot be final, because final prevents overriding but abstract demands it.
//    14. An abstract method cannot be static, because static methods belong to the class and cannot be overridden.
//    15. A class cannot be both abstract and final, because abstract needs inheritance and final blocks it.

}
