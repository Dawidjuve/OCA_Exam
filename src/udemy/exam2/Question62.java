package udemy.exam2;

import java.util.ArrayList;
import java.util.List;

public class Question62 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add(new String("AAA"));
        list.add("AAA");
        
        System.out.println(list.get(0)==list.get(1));
        System.out.println(list.get(0)==list.get(2));
        System.out.println("list.get(0)+\"a\"==list.get(2)+\"a\" = " + (list.get(0)+"a"==list.get(2)+"a"));
        
        String a = list.get(0);
        String b = list.get(2);
        System.out.println("a==b: " + (a==b));
        
        a+="B";
        b+="B";
        System.out.println("a==b: " + (a==b));
    }
}