package chapter6.exceptions;

import java.io.IOException;

public class Animal {

	void move() throws Exception{
		
	}
	
	void move2() throws Exception{
		
	}
	
	void move3() {
		
	}
	
	void move4() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		///1
		
//		Animal a = new Animal();
//		a.move();
//		
//		Animal b = new Dog();
//		b.move();
//		
//		Dog c = new Dog();
//		c.move();
		
		//2
		
//		Dog d = new Dog();
//		d.move2();
	}

}

class Dog extends Animal{
	
	void move() {
		
	}
	
	void move2() throws IOException {
		
	}
	
//	void move3() throws IOException{
//		
//	}
	
	void move4() throws RuntimeException{
		
	}
}
