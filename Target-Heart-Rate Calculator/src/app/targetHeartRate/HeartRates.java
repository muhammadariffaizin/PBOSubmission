package app.targetHeartRate;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int monthBirth;
	private int dayBirth;
	private int yearBirth;
	
	public HeartRates(String first_name, String last_name, int month_birth, int day_birth, int year_birth) {
		this.setFirstName(first_name);
		this.setLastName(last_name);
		this.setMonthBirth(month_birth);
		this.setDayBirth(day_birth);
		this.setYearBirth(year_birth);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMonthBirth() {
		return monthBirth;
	}

	public void setMonthBirth(int monthBirth) {
		this.monthBirth = monthBirth;
	}

	public int getDayBirth() {
		return dayBirth;
	}

	public void setDayBirth(int dayBirth) {
		this.dayBirth = dayBirth;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	public String getBirthday() {
		return this.getMonthBirth() + "/" + this.getDayBirth() + "/" + this.getYearBirth();
	}
	
	public int getAgeInYears() {
		LocalDate now = LocalDate.now();
		LocalDate birthDay = LocalDate.of(this.getYearBirth(), this.getMonthBirth(), this.getDayBirth());
		Period diff = Period.between(birthDay, now);
		return diff.getYears();
	}
	
	public int getMaxHeartRate() {
		int age = this.getAgeInYears();
		return 220 - age;
	}
	
	public double getMinTargetHeartRate() {
		return this.getMaxHeartRate()*(0.5);
	}
	
	public double getMaxTargetHeartRate() {
		return this.getMaxHeartRate()*(0.85);
	}
}
