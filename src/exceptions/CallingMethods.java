package exceptions;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class CallingMethods {

	public static void main(String[] args) /* throws Exception */ { // 1 //3

//		doA();//1
		doB(); // 2
		doC(); // 3
	}

	public static void doA() throws Exception {

	}

	public static void doB() throws RuntimeException {

	}

	public static void doC() {
		throw new RuntimeException();
	}

	///////4 Która metoda siê skompiluje?
	
//	public static void handle1() {
//		try {
//			doD();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static void handle2() {
//		try {
//			doD();
//		} catch (NoMoreCarrotsException e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static void handle3() {
//		try {
//			doD();
//		}catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static void handle4() {
//		try {
//			doD();
//		}catch (IOException e) {
//			// TODO: handle exception
//		}
//	}

	public static void doD() {
	}
}

class NoMoreCarrotsException extends Exception {
}
