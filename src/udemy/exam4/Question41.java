package udemy.exam4;

public class Question41 {
	 
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
//        add(10.0, new Double(10.0));
    }

}