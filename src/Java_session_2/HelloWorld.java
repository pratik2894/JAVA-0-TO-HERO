package Java_session_2;

import java.util.Scanner;

public class HelloWorld {
    // How java compiles the code ??
    public static void main(String[] args) {
        System.out.println("This is our first java program !");
        String a ;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of num1 and num2 : " + sum);
        sc.close();

    }
}
//Execution flow of java
//HelloWorld --> javaC ( compile ) --> .HelloWorld.class --> JVM ( Machin code )--> screen output
//
//C:\Users\PratikMohite\OneDrive - Atyeti Inc\Documents\Java-practice2

