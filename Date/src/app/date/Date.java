package app.date;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int modelMonth, int modelDay, int modelYear) {
		this.setMonth(modelMonth);
		this.setDay(modelDay);
		this.setYear(modelYear);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String displayDate() {
		return Integer.toString(this.getMonth()) + "/" +
			   Integer.toString(this.getDay()) + "/" +
			   Integer.toString(this.getYear());
	}
}
