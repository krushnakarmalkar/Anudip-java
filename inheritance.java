class Base{
    public void display(){
        System.out.println("Hello Niragas");
    }
}

class Child extends Base{
    public void display1(){
        System.out.println("Hiii");
    }
}
public class inheritance {

    public static void main(String[] args) {
        Child c1 = new Child();

        c1.display();
        c1.display1();
    }
    
}
