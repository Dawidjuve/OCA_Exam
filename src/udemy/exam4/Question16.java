package udemy.exam4;

import java.time.LocalDate;

public class Question16 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());
    }
}