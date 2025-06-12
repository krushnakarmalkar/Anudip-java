class Base{
    public void show (){
        System.out.println("Base class Method");
    }
}

class Child extends Base{
    public void show (){
        System.out.println("Child class Method");
    }

}
public class overriding {
    public static void main (String[] args){

        Child obj = new Child();

        obj.show();
        
        Base b=new Base();
        b.show();

        Base obj2=new Child();
        obj2.show();

    }


    
}
