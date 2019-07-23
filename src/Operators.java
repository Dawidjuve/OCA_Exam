import java.sql.Date;

public class Operators {

	public Operators() {
	}

	public static void main(String[] args) {

		String a = "test " + " java";
//		String b = a - "java";
		a += " ,oracle";
		String c;
//		c+=a;

		System.out.println("10 / 3 = " + 10 / 3);
		System.out.println("10.0 / 3 = " + 10.0 / 3);
		System.out.println("10 / 3.0 = " + 10 / 3.0);
		System.out.println("10.0 / 3.0 =" + 10.0 / 3.0);
		System.out.println("10F / 3F = " + 10F / 3F);
		System.out.println("10F / 3 = " + 10F / 3);
		System.out.println("10 / 3F = " + 10 / 3F);
		System.out.println("10.0F / 3.0F = " + 10.0F / 3.0F);
		System.out.println("10.0 / 3F = " + 10.0 / 3F);

		short d = 5;
		short e = 2;
//		short f = d/e;
		short g = 50 / 2;
		System.out.println(g);

		// Opeartory jedno argumnetowe

//		int x = !5; // DOES NOT COMPILE
//		boolean y = -true; // DOES NOT COMPILE
//		boolean z = !0; // DOES NOT COMPILE

//		boolean h = 0;

		Boolean i = Boolean.valueOf("1");
		System.out.println(i);

		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x = " + x + ", y = " + y);

		// Operatory przypisania

		long j = 10;
		int k = 5;
//		k = k * j;

		k *= k * j;

		long l = 5;
		long ³ = (l = 3);
		System.out.println(³ + " " + l);

		// Operatory logiczne

		boolean m = true;
		boolean n = false;
		System.out.println(m ^ n);

		int o = 6;
		boolean p = (o >= 6) || (++o <= 7);
		System.out.println(o);

		// Operatory równoœci

		int r = 2;
		double rr = 2.0;
		System.out.println(rr == r);

		String s = "dasda";
//		System.out.println(r==s);
//		System.out.println(r==true);

		Date d1 = Date.valueOf("2001-10-10");
		Date d2 = Date.valueOf("2010-10-10");
		d1 = null;
		d2 = null;
		System.out.println(d1 == d2);
//		System.out.println("null=null? " + d1==d2); Konkatenacja idzie od lewej, wiêc podejmowana jest próba po³¹czenia string z date.
		System.out.println("null=null? " + (d1 == d2));
		
		System.out.println("aaaa " + true);

		boolean u = true;
		
		///ró¿ne
//		String t = u; NIE mo¿na konwerto¹æ boolean do Stringa!
		int w = 5;
		System.out.println(w > 2 ? w < 4 ? 10 : 8 : 7); // Nawiasy nie s¹ wymagane
		
		 boolean ww = true, z = true;
		 int yy = 20;
		 ww = (yy != 10) ^ (z=false); //!!!!!!!!!!!
		 System.out.println(ww+", "+yy+", "+z);
		 
		 int aa = 5;
		 String bb = "5";
//		 System.out.println(aa==bb);
		 
		 
		 boolean cc = false;
		 if(cc = true) System.out.println("Success");

	}
}
