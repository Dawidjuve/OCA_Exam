package udemy.exam2;

import java.time.LocalDate;
import java.time.Period;
 
public class Question24 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.parse("2000-01-01");
         Period period = Period.ofYears(-3000);
         System.out.println(date.plus(period));
     }
}