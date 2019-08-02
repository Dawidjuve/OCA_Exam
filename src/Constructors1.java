
public class Constructors1 {
	String name;
	int amount;
	double length;
	public Constructors1(String name) {
		name=name;
		
	}

	public Constructors1() { //mo¿liwe jest utworzenie zmiennej lokalnej o tej samej nazwie co zmienna klasowa.
		String name="a";
	}
	
	public Constructors1(int amount) {
		this.amount=this.amount;
	}
	
	public Constructors1(double length) {
		length=this.length;
	}
	
	public static void main(String[] args) {
		Constructors1 con = new Constructors1("ALA");
		System.out.println(con.name);
		
		Constructors1 con2 = new Constructors1(2);
		System.out.println(con2.length);
	}

}
