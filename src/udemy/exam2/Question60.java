package udemy.exam2;

public class Question60 {
    public static void main(String[] args) {
        m1(null);
//        System.out.println(null);
    }
    
    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }
    
    static void m1(String s) {
        System.out.println("String");
    }
    
    static void m1(Object s) {
        System.out.println("Object");
    }
}