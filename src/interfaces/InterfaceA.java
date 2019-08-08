package interfaces;

import java.io.Serializable;

interface InterfaceA extends Serializable {
	
	int a = 2;
	static int b = 2;
	static final int c = 4;
//	int d;
	
	public default void doS() {}
	public void DoA();
	public abstract void DoB();
	
//	private abstract void doC();
	
//	public default final void doD() {}
	
//	protected void doE();
	
//	protected default void doF() {}
	
	void doG();
	
	 static void doH() {
		
	}
//	 static final void doI() {
//			
//	}
	 
	 

}
