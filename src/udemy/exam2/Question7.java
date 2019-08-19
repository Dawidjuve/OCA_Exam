package udemy.exam2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question7 {
     public static void main(String [] args) {
//         LocalDate date = LocalDate.parse("2018-3-01");
//         System.out.println(date);
    	 
    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-dd");
    	 LocalDate date2 = LocalDate.parse("2018-3-01", dtf);
    	 System.out.println(date2);
     }
}