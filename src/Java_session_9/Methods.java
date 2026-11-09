package Java_session_9;

public class Methods {

    public static void main(String[] args) {

        // What is function ??
        // -> function is the reusable block of code
        // -> Reusable , readable , code becomes easy to maintain
        // Function anatomy
        // access-specifier --> return type --> name --> ( parameter1 , parameter2 ) --> { Body } --> return
        // access specifiers
        // default , public , private , protected

         Methods m = new Methods();
//         int a = m.add(5 , 10);
//        System.out.println(a);
//        m.substract(10 , 5);
//        // int d = m.substract(10 , 5); --> Not allowed in java
//         System.out.println(m.concat("Pratik" , "Mohite"));
         int d = 10; // d : X0000 : value : 10
         m.change(10);
        System.out.println(d);

        // Pass by reference :
        // x : X0000
        System.out.println(Methods.multiply(10 , 20));

    }


    public int add(int a , int b){
        int c = a+b;
        return c;
    }

    public void substract(int a , int b){
        int c = a-b;
        System.out.println(c);
    }

    public String concat(String a , String b){
        String  c = a+b;
        return c;
    }

    // pass by value

    void change (int x){
        // X000 = x0000+10

        x = x+10;
        // X000 = X000+10;
        x = 10 + 10;
        System.out.println(x);
    }

    // what static methods
    public static int multiply(int a , int b){
        int c = a*b;
        return c;
    }

}
