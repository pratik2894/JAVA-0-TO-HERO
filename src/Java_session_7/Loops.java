package Java_session_7;

public class Loops {
    public static void main(String [] args){
        // three loops are there in java
        // 1. For loop
        // 2. whiile loop
        // 3. do while loop

        // For loop

        //    for(int i = 0 ; i<=10 ; i++ ){
        //         System.out.println(i);
        //    }

        // 2. While loop
        // When we don't about the condition in that case we are using the while loop
        // int i = 1;
        // while(i<5){
        //     System.out.println(i);
        // }

        // do while loop
        // 1 : when want the loop for atlest one time then you have to use do-while loop
        // use case : data connection initialize
        // data base : host
        // data port : 8080
        // database string : host:8080
        //    int i = 1 ;
        //    String host = "localhost";
        //    int port = 8080;
        //    do{
        //        if(host=="localhost" && port==8080){
        //         System.out.println("Valid DB connection");
        //        }
        //        else{
        //         System.out.println("invalid Db connection");
        //        }
        //    }while(i<1);

        // 1 . factorial progarm
        // what is factorial
        // 5! = 5*4*3*2*1 = 120

        // int num = 5;
        // int fact = 1;
        // for(int i = 1 ; i<=num ; i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        // }

        // multiple factorials
        // for(int i = 1 ; i<=100 ; i++){
        //     int fact = 1;
        //     for(int j = 1 ; j<=i ; j++){
        //         fact = fact*j;
        //     }
        //     System.out.println( i + " ! = " + fact);
        // }
        // }

        // Prime number program


        // int n = 17 ;
        // boolean isprime = true;
        // if(n<=1){
        //     isprime = false;
        //     System.out.println(n + "Is prime ? :" + isprime);
        // }else{

        //     for( int i = 2 ; i<=Math.sqrt(n); i++ ){
        //     if(n%i == 0 ){
        //         isprime = false;
        //         break;
        //     }
        // }
        // if(isprime){
        //     System.out.println(n + " Is prime ? " + isprime);
        // }else{
        //     System.out.println( n + " Is prime ? " + isprime );
        // }
        // }

        // even odd
        // n%2==0 ?? true
        // n%2 != 0 ?? false

        // 1 : 10 even | odd

        // for(int i = 0 ; i<=10 ; i++){
        //     if(i%2==0){
        //         System.out.println(i + " Is a even number");
        //     }else{
        //         System.out.println(i + " Is a Odd number ");
        //     }
        // }


        // Fibboncai series
        // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13

        // patterns question's

        // Reminder !   // Remove special characters from string and normal character's

        // square pattern
        // rows ?? | col ??
        // 4 | 4

        // ****
        // ****
        // ****
        // ****

        // for(int i = 1 ; i<5 ; i++){
        //     for(int j = 1 ; j<5 ; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }


        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        int row = 5 ;
        int col = 5 ;
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j<=col; j++){
                if(i==1 || i==5 || j==1 || j==5 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
