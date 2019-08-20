package udemy.exam3;

public class Question13 {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";
        
        String str1 = i1 + s1;
        String str2 = i2 + s1;
        
        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");
        
        
        String str3 = i2.intValue() + ":ONE";
        final String str4 = i2.intValue() + ":ONE";
        
        System.out.println(str3 == "1:ONE");
        System.out.println(str4 == "1:ONE");
        
        
    }
}
//t, f, 