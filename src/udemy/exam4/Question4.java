package udemy.exam4;

public class Question4 {
    public static void main(String[] args) {
        extractInt(2.7);
//        extractInt(2);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}