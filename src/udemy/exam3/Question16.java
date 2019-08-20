package udemy.exam3;

public class Question16 {
    public static void main(String[] args) {
        Error obj = new Error();
//        boolean flag1 = obj instanceof RuntimeException; //Line n1
//        boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
        boolean flag5 = new Integer(1) instanceof Number;
//        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);
        System.out.println(flag3 + " : " + flag4 + ": " + flag5);
        
        
        Number n = new Integer(1);
        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Number);
        System.out.println(n instanceof Double);
    }
}
//