abstract class Animal{
    abstract void wallk();

    Animal(){
        System.out.println("Animal is Wallking");
    }

    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Horse extends Animal{
    void wallk(){
        System.out.println("Horse is Wallking");
    }
}
public class Abstract {
    public static void main(String[] args) {

        Horse obj = new Horse();
        obj.eat();
        obj.wallk();
        
    }
    
}
