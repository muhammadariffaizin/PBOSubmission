package id.ac.its.calculatorcli;

import java.util.Scanner;
import id.ac.its.calculatorcli.Calc; 	// Import the Calc Class for the computing processes

public class CalculatorCLI {
	static Scanner scan = new Scanner(System.in); 	// define input
	
	public static void main(String[] args) {
		Calc.init();								// initialize the Calc Class
		while(scan.hasNext()) {						// loop while the have input
			String command = scan.next();			// read the command
			switch (command) {
				case "result":						// showing the last saved result
					if(Calc.isNull) {
						System.out.println("Error - There are no saved result");
					} else {
						System.out.println(Calc.result);
					}
					break;
				case "clear":						// clear the saved result
					Calc.clear();
					break;
				case "help":						// show the help to the screen
					Calc.help();
					break;
				case "exit":						// terminate the program
					Calc.exit();
					break;
				case "add": case "subtract": case "multiply":
				case "divide": case "modulo":										// for calculating process
					String inputFirst = scan.next();								// read the input as string
					String inputSecond = scan.next();								// then check if the input was 'result'
					double firstParam, secondParam;									// then read as the previous result   
					if(inputFirst.equals("result") && Calc.isNull) {				// else parse as double
						System.out.println("Error - There are no previous result");
						break;
					} else if(inputFirst.equals("result")) {
						firstParam = Calc.result;
					} else {
						firstParam = Double.parseDouble(inputFirst);
					}
					if(inputSecond.equals("result") && Calc.isNull) {
						System.out.println("Error - There are no saved result");
						break;
					} else if(inputSecond.equals("result")) {
						secondParam = Calc.result;
					} else {
						secondParam = Double.parseDouble(inputSecond);
					}
					
					switch (command) {								// process the input value with specified command 
						case "add":									// all process was done in the Calc Class
							Calc.add(firstParam, secondParam);		// almost all command receive double as parameter
							break;									// except modulo, it must convert to integer first  
						case "subtract":							// to process
							Calc.subtract(firstParam, secondParam);
							break;
						case "multiply":
							Calc.multiply(firstParam, secondParam);
							break;
						case "divide":
							Calc.divide(firstParam, secondParam);
							break;
						case "modulo":
							int firstParamInt = (int) Math.round(firstParam);
							int secondParamInt = (int) Math.round(secondParam);
							Calc.modulo(firstParamInt, secondParamInt);
							break;
					}
					System.out.println(Calc.result);
					break;
				default:												// for error handling that did not match any command
					System.out.println("Error - unrecognized command");
					break;
			}
			
		}

	}

}
