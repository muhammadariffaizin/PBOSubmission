package app.date;

import app.date.Date;

public class DateTest {

	public static void main(String[] args) {
		Date myBirthday = new Date(1, 24, 2001);
		Date momBirthday = new Date(7, 3, 1965);
		Date dadBirthday = new Date(8, 17, 1969);
		
		System.out.println("My birthday is on " + myBirthday.displayDate());
		System.out.println("My mom's birthday is on " + momBirthday.displayDate());
		System.out.println("My dad's birthday is on " + dadBirthday.displayDate());
	}

}
