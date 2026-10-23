package Java_session_5;

import java.util.Scanner;
class GradeCalculator{
    public static void main(String args[]){

        // case 1 : 3 inputs from user : s1 , s2 , s3
        // case 2 : calculate the percentage
        // case 3 : if value > 90 : A : if value >= 75 B : if value >= 60  'C'

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks ");
        int s1 = sc.nextInt();
        System.out.println("Enter subject 2 marks ");
        int s2 = sc.nextInt();
        System.out.println("Enter subject 3 marks ");
        int s3 = sc.nextInt();
        int total = s1+s2+s3;
        double percentage = total/3.0;
        System.out.println("My Pecentage :  " + percentage);
        String result = (percentage > 60.0) ? "PASS" : "FAIL";
        System.out.println(result);

    }


}