package Java_session_4;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){

// Keyword in java
        // Reserved words with a special meaning to the compiler. They can’t be used as identifiers. All are lowercase.

        // indetifiers
        int a = 10;
        float b = 20;

// variable naming convention rules

// 1.	Can contain letters, digits, _ and $
// 2.	Can’t start with a digit
// 3.	Can’t be a keyword
// 4.	Case-sensitive (age ≠ Age)
// 5.	No spaces or special characters like @, #, -

// int  age = 10; // int reserve keyword
// int AGE = 20;
// double Age = 30.10;
// double Age = 12.10;

// System.out.println("age " + age);
// System.out.println("AGE " + AGE);
// System.out.println("Age " + Age);

// -------------------------------------------------------------------------> How to inputs from System or CMD ( command prompt ) <----------------------------------------------

//
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter num 1");
// int num1 = sc.nextInt();
// System.out.println("Enter num 2 ");
// int num2 = sc.nextInt();
// int sum = num1+num2;
// System.out.println("Sum of num1 and num2 : " + sum);
// sc.close();


        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value 1");
        String str1 = sc.nextLine();
        System.out.println("Enter value 2 ");
        String str2 = sc.nextLine();
// int sum = num1+num2;
        System.out.println("My name  is : " + str1 + " " + str2);
        sc.close();

// scanner class method's

// nextInt()
// nextLong()
// nextDouble()
// nextFloat()
// nextBoolean()

// next()
// nextLine()

// Assignment : Develop a calculator program
// case 1 : take inputs from user's
// case 2 perform Arithematic operation's on input's
// case 3 :Print the out on the screen

    }

}
