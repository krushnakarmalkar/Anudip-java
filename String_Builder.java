public class String_Builder {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.charAt(1));

        sb.setCharAt(1,'x');
        System.out.println(sb);

        sb.insert(0, 's');
        System.out.println(sb);
        


        sb.delete(0, 1);

        System.out.println(sb);

        
    }
    
}
