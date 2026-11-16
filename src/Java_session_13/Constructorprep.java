package Java_session_13;

public class Constructorprep {
    //
    int a ;
    int b ;
    int c ;

    // What are the rules of constructors
// One-slide summary
//#	Rule
//1	Same name as class
//2	No return type
//3	Runs automatically on new
//4 can be overloaded
//5	Default constructor given only if you write none
//6	Can be public/protected/default/private
//7	Cannot be static, final, abstract
//8	Not inherited
//9	this()/super() must be the first statement (only one of them)
//10	Compiler inserts super() if you don’t write it
//11	Parent constructor executes before child’s
//12 Constructor cannot override

    // Types of constructor
    // 1. Default constructor
    // 2. parameterized constructor

    Constructorprep(){
        this.a = 10;
        this.b = 20;
        this.c = 30;
        this(100 , 200 );
        System.out.println("This is an Parent class constructor !!!! ");
    }
    Constructorprep(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Constructorprep(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("This is 2 parameter Parent constructor !!! ");
    }

//    public static void main(String[] args) {
//        Constructorprep constructorprep = new Constructorprep();
////        System.out.println(constructorprep.a);
//        System.out.println(constructorprep.c  + " " + constructorprep.b + " " + constructorprep.c);
//
//
//    }

}

class Child extends Constructorprep{

    Child(){
        super(1000 , 2000);
        super.a = 10;
        super.b = 20;
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}

