interface Animal {
    void wallk(); // Method Signature

    
}
public class Interface implements Animal {
    public void wallk(){  // Method Implementation
        System.out.println("Interface's Method Implemented");
        
    }
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.wallk();
        
    }
    
}
