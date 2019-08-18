import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



//import static java.util.Arrays;
//import static java.util.Arrays.*;
import static java.util.Arrays.asList;
//static import java.util.Arrays.*;
//import java.util.*;


public class Preview {

	public static void main(String... args) {
		
//		List<Integer> ages = new ArrayList<>();
//		ages.add(Integer.parseInt("5"));
//		ages.add(Integer.valueOf("6"));
//		ages.add(7);
//		ages.add(null);
//		for (int age : ages)
//			System.out.print(age);
		
		
		
//		Double d = null;
//		double f = d;
		
		
//		int i = Integer.valueOf(2);
		
//		int [] z ;
//		z =  {1, 2};
		
		
		
//		String a = "bb";
//		a+=new ArrayList<>();

		
		
		
//		labl: if(a.equals("aaa")) {
//			break labl;
//		}
		
		
		LocalDate date11 = LocalDate.now();
		Period period2 = Period.ofYears(1).ofWeeks(1);
		System.out.println(date11.plus(period2));
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM,, dd yyyy");
//		LocalDate date17 = LocalDate.parse("01 02 2015", f3);
		LocalDate date18 = LocalDate.parse("01,, 02 2015", f3);
		
		
		walk(1);
		walk(1,2,3,4,5);
//		walk(1, {1,123,4,1});
		walk(1, new int[3]);
//		walk(1, null);
		
		
//		List<String> list2 = Arrays.asList("aaa", "bbb");
		
		
		String aa = "aaa";
		aa+=null;
		System.out.println("aa = " + aa);
		
		
		int bb = 1;
		int cc = -bb;

		StringBuilder sb = new StringBuilder();
		String s = "aa";
//		System.out.println(sb.equals(s));
//		System.out.println(sb==s);
//		System.out.println(s.equals(sb));
	}
	
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
}
