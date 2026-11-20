package Java_session_14;

public class StringPrep {

    // String's are mutable or immutable ??
    // --> Strings are basically immutable

    // Immutable means that once a String is created, its content can never be changed. Think of a
    //printed certificate: you cannot edit the printed text. If something changes, you print a new
    //certificate.

//    Why is String immutable? (a common interview question)
//        1 Security: Strings hold passwords, file paths, DB URLs and class names. They must not change
//        after validation.
//        2 String pool: many variables can safely share one object.
//        3 Thread safety: immutable objects can be shared across threads without locks.
//        4 Hashcode caching: the hash is calculated once, which makes HashMap keys fast

    // String constant pool ??
    // -->


    public static void main(String[] args) {
//        String a = "Pratik"; // String are immutable
//        String b = a.concat("Nikhil");
//        // "PratikNikhil"
//        System.out.println(b);

//        String a = "Pratik";
//        String b = "Pratik";
//        String e = "Pratik";
//        String c = new String("Pratik");// X0000
//        String d = new String("Pratik");// X0001

        // JVM ??
        // SCP
//        if(a == b){
//            System.out.println("Yes it is stored in SCP ! ");
//        }
        // SCP : X0002 : Pratik <- -a , <-- b , <-- e


        // Heap memory
//        if(c==d){
//            System.out.println("String Objects are stored in HEAP !! ");
//        }

        // == --> Always check / compare  the memory address
        // equals() --> This method use to compare the values of string

//        if(a.equals(b)){
//            System.out.println("Values are matched!! ");
//        }
//
//        if(c.equals(d)){
//            System.out.println("Values are matched!! ");
//        }

//            String s1 = "Java"; // literal
//            String s2 = "Java"; // literal
//            String str2 = new String("Java"); // Object
//            String str3 = new String("Java"); // Object
//          STRING POOL                            HEAP (normal area)
//                +--------------+                +--------------+
//                |    "Java"    | <-- s1, s2     |    "Java"    | <-- s3
//                +--------------+                +--------------+
                      //X0001                         //X002
//        String mystr1 = "User1";
//        String mystr2 = "User2";
//        String mystr3 = "User1";
//
//        String mystr4 = new String("User4");

        // SCP  ? : User1 : <-- myst1 , mystr3  , User2 : <--- mystr2
        // HEAP ? : X0001 : User4 : mystr4


        // What is String buffer and String Builder ??
        // This both are use to create mutable strings

//        StringBuilder stringBuilder = new StringBuilder("Java");
//        stringBuilder.append(" SpringBoot");
//        "Java SpringBoot"
//        stringBuilder.replace(0 , 4 , "Plus");
//        System.out.println(stringBuilder);
//        "Plus SpringBoot"

        //
//        StringBuffer stringBuffer = new StringBuffer("Java");
//        stringBuffer.append("Spring Boot");
//        System.out.println(stringBuffer);

        // Difference between StringBuffer and StringBuilder ??
       //  StringBuilder : Thread unsafe
       //  StringBuffer : Thread safe
        // Thread safe : at a time more than one thread cannot access the string : t1 --> "Java"
        // Thread unsafe : at a time more than one thread can access the string : t1 , t2 , t3 --> "Java"

        // "Pratik Mohite" <-- secure at
        //
        // Queue : 1 , 2 , 3
        // Bhandara : 1 , 2 , 3  //
    }

}
