package app.targetHeartRate;

import java.util.Scanner;

import app.targetHeartRate.HeartRates;

public class HeartRatesTest {
	static Scanner scan = new Scanner(System.in);
	
	public static void printMenus() {
		System.out.println("---------------------------------");
		System.out.println("Target Heart Rate Calculator");
		System.out.println("Choose an action :");
		System.out.println("(1) Insert information");
		System.out.println("(2) Print summary");
	}
	
	public static void insertInformation(HeartRates newUser) {
		scan.nextLine();
		System.out.println("Insert your first name");
		newUser.setFirstName(scan.nextLine());
		System.out.println("Insert your last name");
		newUser.setLastName(scan.nextLine());
		System.out.println("Insert your month of birthday");
		newUser.setMonthBirth(scan.nextInt());
		System.out.println("Insert your day of birthday");
		newUser.setDayBirth(scan.nextInt());
		System.out.println("Insert your year of birthday");
		newUser.setYearBirth(scan.nextInt());
		
		System.out.println("Information has been added!");
	}
	
	public static void printSummary(HeartRates user) {
		System.out.println("Below is the summary about the heart rates");
		System.out.println("First Name : " + user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		System.out.println("Date of birth : " + user.getBirthday());
		System.out.println("Age (in years) : " + user.getAgeInYears());
		System.out.println("Maximum heart rate (in beats per minute) : ");
		System.out.println(user.getMaxHeartRate());
		System.out.println("Target heart rate range (in beats per minute) : ");
		System.out.println(user.getMinTargetHeartRate() + " - " + user.getMaxTargetHeartRate());		
	}
	
	public static void main(String[] args) {
		HeartRates user = new HeartRates(null, null, 0, 0, 0);
		
		while(true) {
			printMenus();
			int choose = scan.nextInt();
			switch(choose) {
				case 1:
					insertInformation(user);
					break;
				case 2:
					printSummary(user);
					break;
			}
		}
	}
}
