// public class Array_DS {

//     public static void main(String[] args) {
//         int [] num = new int [5];
//         num [0]=10;
//         num [1]=15;
//         num [2]=18;
//         num[3]=20;
//         num[4]=30;

//         for (int i=0; i<5;i++){
//             System.out.println("\n
//             Data: "+num[i]);
//         }
        
//     }
    
// }

// Take an array as ip from user; search for given number for x & print the index at occurs

import java.util.*;

public class Array_DS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];  

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int index = -1; // Declare outside loop

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i; // store index if found
                break;     // stop searching
            }
        }

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close();
    }
}
