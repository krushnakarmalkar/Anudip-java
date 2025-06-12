// public class Conditional_Stmt {
//     public static void main(String[] args) {
//         int a= 10;

//         if (a % 2 == 0){
//             System.out.print("Value is Even..");
//         }
//         else{
//             System.out.println("Value is ODD");
//         }
//     }
    
// }



// import java.util.*;
// public class Conditional_Stmt{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 3 num:");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         int c =sc.nextInt();
        

//         if(a > b){
//             System.out.println(a+" is Greater");
//         }
//         else if (b>c){
//             System.out.println(b+" is Greater");
//         }
//         else{
//             System.out.println(c+" is Greater");
//         }


//     }
// }


import java.util.*;
public class Conditional_Stmt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice from 1 to 4: ");
        int a=sc.nextInt();
       

        if(a == 1){
            System.out.println("Hello");
        }

        else if (a == 2){
            System.out.println("Namaste");

        }
           else if (a == 2){
            System.out.println("Good morning");

        }

        else{
             System.out.println("Good night");

        }

    }
}