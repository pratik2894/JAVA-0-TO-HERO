package Java_session_8;
import java.lang.reflect.Array;
import java.util.Arrays;
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
        // 2-D array
        // x -----
        // Y |



        // How we can access the elements from 2-D array
        // System.out.println(myArr[1][0]);
        // [[I@7ff2a664 --> myArr
        // [I@3f200884 --> myArr[0]
        // myArr[0][0]) --> 1

        // Using for loop in 2-D array

        // for( int i = 0 ; i<3 ; i++ ){
        //     for(int j = 0 ; j<3 ; j++){
        //         System.out.print(myArr[i][j] + "  ");
        //     }
        //     System.out.println();
        // }

        //    int[][] myArr = {
        //     {1 , 2 , 3},
        //     {4 , 5 , 6},
        //     {7 , 8 , 9}
        // };

        // for(int i = 0 ; i<3 ; i++){
        //     for(int j = 0 ; j< 3 ; j++){
        //         System.out.print(myArr[i][j] + "  ");
        //     }
        //     System.out.println();
        // }

        // Find max-element in array
        // Fid min-element in array
        // int [] arr = {8 , 2 , 10 , 5};
        // int max = arr[0];
        // for(int i = 0 ; i<arr.lenght() ; i++){
        //     if(arr[i] < max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Maximum element in the array is : " + max);


        // Arrays utility class
        // In java we don't have any in-buit method for Array's
        // java.util.Arrays;

        // sort() : It will sort all the element of array
        // --> 10 , 0 , 11 , 9  --> sorted --> 0 , 9 , 10 , 11
        // length() : It will give you the length of array
        // clone() : it will generate the shallow copy of the array
        // toString() : it will print array in string format
        // binarySearch(arr , key) : it will search the element in array using binary search
        // fill (arr , value) :  Fill all elements with one value

        int [] arr = {10 , 0 , 1 , 11 , 20};
        // Arrays a = new Arrays();
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);
        System.out.println("Element found at index : " +  Arrays.binarySearch(arr , 20));
        Arrays.fill(arr , 3);
        System.out.println(Arrays.toString(arr));
    }

}
