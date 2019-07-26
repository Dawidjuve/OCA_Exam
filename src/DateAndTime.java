import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class DateAndTime {

	public DateAndTime() {
	}

	public static void main(String[] args) {

		System.out.println("LocalDate.now() = " + LocalDate.now());
		System.out.println("LocalTime.now() = " + LocalTime.now());
		System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

		// Tworzenie daty
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);

		// Tworzenie czasu
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);

		// Tworzenie dato-czasu

		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
//		LocalDateTime dateTime3 = LocalDateTime.of(2015, Month.JANUARY, 20, 6);

//		LocalDate d = new LocalDate();

//		LocalDate.of(2015, Month.JANUARY, 32);

//		LocalDate.of(2015,  Calendar.JANUARY, 23);

		LocalDate date3 = LocalDate.of(2015, Calendar.FEBRUARY, 23);
		System.out.println(date3);

		// Operacje na dacie i czasie

		System.out.println("\n ---Operacje na dacie i czasie---\n");

		// daty
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date.plusDays(2);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);

		LocalDate date4 = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date4);
		date4 = date4.plusDays(2);
		System.out.println(date4);
		date4 = date4.plusWeeks(1);

		System.out.println(date4);
		date4 = date4.plusMonths(1);
		System.out.println(date4);
		date4 = date4.plusYears(5);
		System.out.println(date4);

		LocalDate date5 = LocalDate.now().plusDays(7).plusWeeks(4).plusYears(1);
		System.out.println("date5 = " + date5);

		LocalDate date6 = LocalDate.now().plusDays(10);
		System.out.println("date = " + date6);

		// czas i data
		System.out.println("\n ---LocalTimeDate---\n");
		LocalDate date7 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);

		LocalDate date8 = LocalDate.of(2020, Month.JANUARY, 20);
//		date = date.plusMinutes(1);

		// Periods

		System.out.println("\n ---Periods---\n");

		System.out.println("LocalDate.now().toEpochDay() = " + LocalDate.now().toEpochDay());

		LocalDate date9 = LocalDate.now();
		Period period = Period.ofMonths(2);
		date9 = date9.plus(period);
		System.out.println(date9);

		LocalDate date10 = LocalDate.now();
		date10 = date10.plus(Period.of(1, 0, 1));
		System.out.println("date10 = " + date10);

		LocalDate date11 = LocalDate.now();
		Period period2 = Period.ofYears(1).ofWeeks(1);
		System.out.println(date11.plus(period2));

		LocalTime time4 = LocalTime.now();
		Period period3 = Period.ofDays(1);
//		time4.plus(period);

		System.out.println("\n ---Formatowanie---\n");

		LocalDate date12 = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date12.getDayOfWeek());
		System.out.println(date12.getMonth());
		System.out.println(date12.getYear());
		System.out.println(date12.getDayOfYear());

		LocalDate date13 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time5 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime4 = LocalDateTime.of(date13, time5);
		System.out.println(
				"date13.format(DateTimeFormatter.ISO_LOCAL_DATE) = " + date13.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(
				"time5.format(DateTimeFormatter.ISO_LOCAL_TIME) = " + time5.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("dateTime4.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) = "
				+ dateTime4.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime4));
		System.out.println(shortDateTime.format(date13));
//				System.out.println(shortDateTime.format(time5));

		DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime4.format(shortDateTime));
		System.out.println(date13.format(shortDateTime));
//		System.out.println(time5.format(shortDateTime));

		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("DateTime short = " + shortF.format(dateTime4));
		System.out.println("DateTime medium = " + mediumF.format(dateTime4));

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println("Format: MMMM dd, yyyy, hh:mm = " + dateTime4.format(f));

		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
		f1.format(dateTime);
//		f1.format(date); 
		f1.format(time);
		
		
		//Parsowanie
		
		System.out.println("\n ---Parsowanie---\n");
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date14 = LocalDate.parse("01 02 2015", f2);
		LocalTime time6 = LocalTime.parse("11:22");
		System.out.println(date14);
		System.out.println(time6); 
		
//		LocalDate date15 = LocalDate.parse("13 02 2015", f2);
//		LocalDate date15 = LocalDate.parse("01, 02 2015", f2);
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM,, dd yyyy");
//		LocalDate date17 = LocalDate.parse("01 02 2015", f3);
		LocalDate date18 = LocalDate.parse("01,, 02 2015", f3);
	}

}
