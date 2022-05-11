package Encapsulation_11;

public class Date_1 {
	
	private int Day;
	private int Month;
	private int Year;
	public Date_1() {  }	
//go to source option choose generate constructor using fields
	public Date_1(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
//go to source option choose generate getter setter.	

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
//go to source generate to String.

	@Override
	public String toString() {
		return "Date_1 [getDay()=" + getDay() + ", getMonth()=" + getMonth() + ", getYear()=" + getYear() + "]";
	}


}
