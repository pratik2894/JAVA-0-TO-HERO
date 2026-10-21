package Java_session_3;

public class HellowWorld {
    // Instance variable

    int b; // if we are not assigning any value to instance variable then it will it's default value
    // static
    static int c;
    char d = 'Z'; //-> 'A --> 'B'


    public static void main(String[] args){
        int a = 10;
        //  b = 10; // now allowed
        // datatype name value

        byte mybyte = 129;
        System.out.println("Hellow World");
        System.out.println(a);
        System.out.println(mybyte);

        // Types of variables
        // 1 --> Local variable

        HellowWorld myObj = new HellowWorld();
        System.out.println(myObj.b);
        System.out.println(myObj.c);
        System.out.println(myObj.d);

    };

//  public String myFunc {
//     System.out.println(a);
//  }


//  Stack memory  ??
//  Heap memory   ??

// int a = 10 --> primitive
// Array b = [20 , 30]; --> non primitive data type

// stack : primitive data types java store in stack
// head :  non-primitive data types in java store in Heap

// stack :
// a : 10
// b : X09880909

// Heap :

// X09880909:[20 , 30]
}
