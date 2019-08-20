package udemy.exam3;

import java.time.LocalDate;

public class Question44 {
    public static void main(String [] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));
        
        System.out.println(joiningDate.withDayOfMonth(20));
        System.out.println(joiningDate.withMonth(5));
        System.out.println(joiningDate.withYear(29));
        
        
    }
}