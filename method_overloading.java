class Calculator{
        void cal (int a, int b ){
        System.out.println((a+b));
        }
    
        void cal (double a, double b ){
            System.out.println((a+b));
        }


}
public class method_overloading {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.cal(4, 5);
        obj.cal(18.75, 15.5);
    }



    
    
}
