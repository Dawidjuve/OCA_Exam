package udemy.exam2;

import java.util.ArrayList;
import java.util.List;

public class Question39 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();
       
        list.add(27);
        list.add(27);

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
        
        Integer a = 2;
        Integer b = 2;
        Integer c = Integer.valueOf(2);
        System.out.println(a==b);
        System.out.println(b==c);
        
        System.out.println("BOOLEAN");
        Boolean b1 = true;
        Boolean b2 = Boolean.valueOf("TRuE");
        Boolean b3 = new Boolean(true);
        
        System.out.println(b1==b2);
        System.out.println(b1==b3);
        System.out.println(b2==b3);
    }
}