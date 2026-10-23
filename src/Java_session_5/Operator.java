package Java_session_5;

class Operator {

    public static void main(String args[]){

        // // List of operators in java
        // 1. Arithmatic operator
        // 2. Relational operator
        // 3. Logical Operator
        // 4. Assignment Operator
        // 5. unary operator
        // 6. ternary operator

        // Arithmatic operator
        // + , - , * , / , %
        // it will return a number
        // int a = 10 ;
        // int b = 5 ;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        // 2. Relational Operator
        // == , ! , = , < , > , >= , <=
        // it will always return boolean value : true / false

        // int a = 20;
        // int b = 20;
        // int c = b;
        // System.out.println(a==b);
        // System.out.println( a != 20);
        // System.out.println(c);
        //  System.out.println(a<b);
        //  System.out.println(a>b);
        //  System.out.println(a>=b);

        // 3. Logical Operator
        // && , || , !
        // int a = 10 ;
        // int b = 20;
        // System.out.println( a>b && a>5 ); // Both needs condtion needs to be satisfy
        // System.out.println( a>b || a>5 ); // Either one condition needs to be satisfy

        // 4. Assignment Operator
        // = , += , -= , %= , /=
        // int a = 10 ;
        // int b = 20 ;
        // System.out.println(a+=10); // a = a + 10; // a +=10


        // 5. Unary Operator
        //  ++ , --


         int a = 10 ;
         int b = 20 ;
         System.out.println(a++); // Post increment : first it will print then it will increment
         System.out.println(a);
         System.out.println(++a); // Pre increment  : first it will increment the value and then it will assign
         System.out.println(a--); // Post decrement  : first it will print then it will increment
         System.out.println(a);
         System.out.println(--a); // Pre decrement  : first it will increment the value and then it will assign

//         6. ternary operator
//         condition ? "true : value ?" : "false : value ?"
         int age = 17;
         int eligibility = (age > 20) ? 1 : 0;
         System.out.println(eligibility);



    }


}
