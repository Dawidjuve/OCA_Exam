package udemy.exam1;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.append(null).length());
    	
    	String s = null;
    	System.out.println(sb.append(s).length());
        
        ClassA a = new ClassA();
        a.doA(null);
    }
    
    
}

class ClassA{
	
//	public void doA(Integer a) {
//		System.out.println("int");
//	}
	
//	public void doA(Object b) {
//		System.out.println("Object");
//	}
	
	public void doA(String a) {
		System.out.println("String");
	}
}