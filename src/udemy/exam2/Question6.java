package udemy.exam2;

public class Question6 {
	 
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
    
    private static void add(Long l1) {
        System.out.println("Long version");
    }
    
    

    public static void main(String[] args) {
        add(10.0, new Integer(10));
//        add(2);
        

    }

} //Co siê stanie?

//W tym przypadku wymagana jest tylko jedna konwersja (Integer->int), poniewa¿ int mo¿na przypisaæ do double