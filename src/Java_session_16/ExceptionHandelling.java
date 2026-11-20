package Java_session_16;

import java.awt.*;
import java.io.IOException;

public class ExceptionHandelling {

    // What is Errors ?
    // What is Exception ?

//    java.lang.Object
// └── java.lang.Throwable
//      ├── java.lang.Error (Unchecked - JVM/System level)
//            │    ├── OutOfMemoryError
//      │    ├── StackOverflowError
//      │    ├── VirtualMachineError
//      │    └── AssertionError
//      │
//              └── java.lang.Exception
//           ├── Checked Exceptions (Compile-time)
//           │    ├── IOException
//           │    │    ├── FileNotFoundException
//           │    │    └── EOFException
//           │    ├── SQLException
//           │    ├── ClassNotFoundException
//           │    └── InterruptedException
//           │
//                   └── java.lang.RuntimeException (Unchecked - Run-time)
//            ├── NullPointerException
//                ├── ArithmeticException
//                ├── IllegalArgumentException
//                │    └── NumberFormatException
//                ├── IndexOutOfBoundsException
//                │    ├── ArrayIndexOutOfBoundsException
//                │    └── StringIndexOutOfBoundsException
//                └── ClassCastException

//    Types Of Exception:
//
//    Checked Exceptions.
//    Unchecked Exception.
//    Checked Exception:
//
//    Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
//    The compiler ensures whether the programmer handles the exception or not.
//    The programmer should have to handle the exception;
//    otherwise, the system has shown a compilation error.
//
//    Unchecked Exceptions:
//
//    The unchecked exceptions are just opposite to the checked exceptions.
//    The compiler will not check these exceptions at compile time.
//    In simple words, if a program throws an unchecked exception,
//    and even if we didn’t handle or declare it the program would not give a compilation error.
//    Usually, it occurs when the user provides bad data during the interaction with the program.
//

    public static void main(String[] args) {
//        try {
//            int a = 10;
//            int arr[] = {10 , 20 , 30};
//            int c = a / 0;
//           //  System.out.println(c);
//            // databse connection () ;
//            System.out.println(arr[4]);
//        }finally {
//            System.out.println("This block will always execute !! ");
//            // close();
//        }

        // throw and throws ??
        // throw --> To manually thow and exception
    // throws --> Purpose: Declares one or more exception types that a method might throw during execution.

    ExceptionHandelling exceptionHandelling = new ExceptionHandelling();
        try{
        exceptionHandelling.division();
    }catch (Exception runtimeException){
        System.out.println(runtimeException.getMessage());
    }
        try {
            exceptionHandelling.CheckUser("darshan");
        }catch (UserNotFoundExcption userNotFoundExcption){
            System.out.println(userNotFoundExcption.getMessage());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }


}

    public void division() throws Exception {
        int a = 10;
        int b = 0;
        if (a > 0) {
            if(b==0){
                throw new Exception("Arithematic excpetion occured in program!!");
           }
            int c = a / b;

        }

    }


    public void CheckUser(String UserName){

        if(!UserName.equals("Pratik2894")){
            throw new UserNotFoundExcption("User not found with this username : " + UserName);
        }

    }

}
