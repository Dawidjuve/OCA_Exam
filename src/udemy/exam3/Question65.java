package udemy.exam3;
import java.util.ArrayList;
import java.util.List;
 
public class Question65 {
     public static void main(String[] args) {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("aaa");
         dryFruits.add("aaa");
         dryFruits.add("aaa");
         dryFruits.add("aaa");
 
         for(int i = 0; i < dryFruits.size(); i++) 
         {
             
                boolean f =  dryFruits.remove("aaa");
                System.out.println("f = " + f + " i= " + i);
             
          }
 
         System.out.println(dryFruits);
         
         
         List<String> dryFruits2 = new ArrayList<>();
         dryFruits2.add("aaa");
         dryFruits2.add("aaa");
         dryFruits2.add("aaa");
         dryFruits2.add("aaa");
         
         for(String s : dryFruits2) {
        	 dryFruits2.remove("aaa");
         }
     }
}