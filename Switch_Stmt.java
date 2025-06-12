import java.util.Scanner;
public class Switch_Stmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value:");
        int x= sc.nextInt();
        int y= sc.nextInt();


        System.out.println("Enter your choice: ");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction\n");
        
        int ch= sc.nextInt();

        switch(ch){
            case 1:
                System.out.print("Addition: "+ (x+y));
                break;
            case 2:
                System.out.print("Subtraction: "+ (x-y));
                break;
            
            default:
                System.out.println("Invalid Choice");
                
            
        }
        sc.close();

    }
    
}
