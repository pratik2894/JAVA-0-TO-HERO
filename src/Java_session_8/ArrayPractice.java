package Java_session_8;

class ArrayPractice {


    public static void main(String args []){
        // Arrays
        // 1. Arrays is linear data structure
        // 2. Arrays have fix length
        // 3. Array store only one type of data in it
        // 4. Array is non-primitive data type
        // 5. Array index is always start from 0

        // In java we have arrays
        // 1. 1-D array
        // 2. 2-D array

        // Syntax of array's in java

        // int[] marks = {10 , 20 , 30 , 40 , 50};
        // // System.out.println(marks[1]);
        // for(int i = 0 ; i<5 ; i++ ){
        //     System.out.println(marks[i]);
        // }
        // enhanced for loop

        // for(int s : marks){
        //     System.out.println(s);
        // }

        // [I@221af3c0 --> Heap Memory

        // Linear search

        int[] marks  = {10,20,30,40,50};
        int  search = 60;
        int flag = 0;

        for(int i = 0 ; i<5 ; i++){
            if(marks[i]==search){
                flag = 1;
                System.out.println("Element found at index : " + i);
            }
        }
        if(flag == 0){
            System.out.println("Element is not present in the array");
        }

    }

}
