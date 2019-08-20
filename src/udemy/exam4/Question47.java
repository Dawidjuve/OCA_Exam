package udemy.exam4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question47 {
    public static void main(String [] args) {
        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("1947-08-15", 
                                               DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date3 = LocalDate.of(1947, 8, 15);

        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));
        System.out.println("ISO_DATE = " + date1);
        System.out.println("ISO_LOCAL_DATE = " + date2);
        
        LocalDate date4 = LocalDate.parse("19470815", DateTimeFormatter.BASIC_ISO_DATE);       
        System.out.println("BASIC_ISO_DATE = " + date4);
        
        LocalDate date5 = LocalDate.parse("1947-08-15T10:15", DateTimeFormatter.ISO_DATE_TIME); 
        System.out.println("ISO_DATE_TIME = " + date5);
        
        
        System.out.println("ISO_DATE = " + date1);
        System.out.println("ISO_DATE = " + date1);
        
        short a= 2;
//        Integer b = a;
    }
}


//BASIC_ISO_DATE - '20111203'
//, ISO_DATE - '2011-12-03+01:00'; '2011-12-03'
//, ISO_LOCAL_DATE - '2011-12-03'
//, ISO_TIME - '10:15:30+01:00'; '10:15:30'
//, ISO_LOCAL_TIME -  '10:15:30'
//, ISO_DATE_TIME '2011-12-03T10:15:30+01:00[Europe/Paris]
//, ISO_LOCAL_DATE_TIME -  	'2011-12-03T10:15:30'