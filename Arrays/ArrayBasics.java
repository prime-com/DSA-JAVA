package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        
        // ‼️ DECLARATION AND INITIALIZATION
        int[] arr = {10,55,5,20,30,40,50};

        // System.out.println(arr[0]);
        // System.out.println(arr[2]);
        // System.out.println(arr.length);

        // ‼️TRAVERSING ARRAY

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        //‼️ UPDATING ELEMENTS 
        // arr[2] = 100;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // ‼️ ENHANCED FOR LOOP
        // for (int num : arr) {
        //     System.out.println(num);
        // }

        // ‼️Updating array elements and printing the modified array
        // for ( int i = 0; i < arr.length;i++) {
        //     arr[i] = arr[i] + 1;
        // }

        // for ( int num : arr) {
        //     System.out.println(num);
        // }

        //‼️max. num in array

        // int max = arr[0];
        // for ( int i = 1;i < arr.length;i++) {
        //     if ( max < arr[i] ) {
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //‼️min. num in array
        // int min = arr[0];

        // for ( int i = 1 ; i <  arr.length; i++) {
        //     if ( min > arr[i]) {
        //         min = arr[i];
        //     }
        // }
        // System.out.println(min);

        //‼️ sum of all elements 

        // int sum = 0;
        // for ( int i = 0 ; i < arr.length ; i++) {
        //     sum += arr[i];
        // }
        // System.out.println(sum);

        // ‼️ average of array
        // int sum = 0;
        // for ( int i = 0 ; i < arr.length ; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("average : " + sum/arr.length);

        //‼️ simple linear search
    //     int i = 0;
    //     for ( i = 0 ; i < arr.length ; i++){
    //         if ( arr[i] == 18 ) {
    //             System.out.println("18 is present.");
    //             break;
    //         }
           
    //    } 
    //     if (i == arr.length) {
    //             System.out.println("18 not present");
    //         }

    //‼️ simple linear search with BOOLEAN method

    // boolean IsPresent = false;

    // for ( int i = 0 ; i < arr.length ; i++) {
    //     if ( arr[i] == 18  ) {
    //         IsPresent = true;
    //         break;
    //     }
    // }
    //     if(IsPresent) {
    //         System.out.println("18 is present.");
    //     }
    //     else {
    //         System.out.println("18 is not present.");
    //     }

    // ‼️ to check if the element is present, if yes then print it with index number

    // int i = 0;
    // int index = 0;
    // boolean IsPresent = false;


    // for ( i = 0 ; i < arr.length; i++) {
   
    //     if ( arr[i] == 5 ) {
    //         IsPresent = true;
    //         index = i+1;
    //         break;
    //     }
    // }

    // if ( IsPresent) {
    //     System.out.println("5 is present @index : " + " " + index);
    // }
    // else {
    //     System.out.println("5 is not present.");
    // }

    // ‼️ simple swap
    // int a = 10;
    // int b = 20;

    // int temp = a; 
    
    // a = b;
    
    // b = temp;
   
    // System.out.println(a + " " + b);

    //‼️ reversing an array

    // for (  int left = 0, right = arr.length - 1;left < right ; left++ , right--) {
    //     int temp = arr[left];

    //     arr[left] = arr[right];
    //     arr[right] = temp;  
        
    // }
    // for ( int i = 0 ; i < arr.length ; i++) {
    //     System.out.println(arr[i]);
    // }

    // System.out.println();

    // ‼️ reversing a string (leetcode)

    char[] s = {'a','e','i','o','u'};

    for ( int left = 0, right = s.length - 1; left < right ;left++ ,right--) {
        char temp = s[left] ;
        s[left] = s[right];
        s[right] = temp;
    }
    for (int i = 0; i< s.length;i++) {
        System.out.println(s[i]);
    }
        }

    }
