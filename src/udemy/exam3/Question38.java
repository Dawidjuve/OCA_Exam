package udemy.exam3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
public class Question38 {
     public static void main(String [] args) {
          System.out.println(LocalDate.parse("1987-09-01").format(
                                    DateTimeFormatter.ISO_DATE_TIME));
     }
}