package id.ac.its.calculatorcli;

// Calc Class
// used to processing any computation command
// and handle some other command

public class Calc {						
	public static double result;	// variable that save the previous result
	public static boolean isNull;	// variable that indicate is the result was cleared or not
	
	public static void init() {		// for initialization command
		result = 0;
		isNull = true;
	}
	
	public static void clear() {	// for reset the saved result
		result = 0;
		isNull = true;
	}
	
	public static void add(double first, double second) {		// addition method
		isNull = false;
		result = first + second;
		return;
	}
	
	public static void subtract(double first, double second) {	// subtraction method 
		isNull = false;
		result = first - second;
		return;
	}
	
	public static void multiply(double first, double second) {	// multiplication method
		isNull = false;
		result = first * second;
		return;
	}
	
	public static void divide(double first, double second) {	// division method
		isNull = false;
		result = first / second;
		return;
	}
	
	public static void modulo(int first, int second) {			// modulo method
		isNull = false;
		result = first % second;
		return;
	}
	
	public static void help() {									// show all command method
		System.out.println("All possible command line :");
		System.out.println("add x y 		-> return the sum of x and y");
		System.out.println("subtract x y 	-> return the subtraction of x and y");
		System.out.println("multiply x y 	-> return the multiplication of x and y");
		System.out.println("divide x y 		-> return the division of x and y");
		System.out.println("module x y 		-> return the modulation of x and y");
		System.out.println("result 			-> show the previous result");
		System.out.println("clear 			-> clear the previous result");
		System.out.println("help 			-> show this help");
		System.out.println("exit 			-> terminate the program");
		System.out.println("Notes : both x and y can be replaced with 'result' to operate with previous result");
	}
	
	public static void exit() {									// terminate the program
		System.out.println("Terminating program..");
		System.exit(0);
	}
}
