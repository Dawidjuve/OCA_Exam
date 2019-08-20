package udemy.exam3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
 
public class Question4 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
         Period period = Period.parse("P-30000Y");
         System.out.println(date.plus(period));
         
         
//         Period period2 = Period.parse("P003D2M");
//         System.out.println(date.plus(period2));
         
       Period period2 = Period.parse("-P1Y");
       System.out.println("period2 = " + period2);
       System.out.println(date.plus(period2));
         
       Period period3 = Period.parse("P1Y2M3W20D");
       System.out.println("period3 - " + period3);
       System.out.println(date.plus(period3));
         
         
         
         
         Period p5 = Period.of(1, 2, 25);
         System.out.println("p5 = " + p5);
     }
}