package com.neosoft.enumPack;

public class EnumWeekDaysTest {
	
	WeekDays day;

	public EnumWeekDaysTest(WeekDays day) {
		this.day = day;
	}

	void dayCheck() {
		switch (day) {
		case MONDAY:
			System.out.println("MONDAY is Busy Day...");
			break;
		case TUESDAY:
			System.out.println("TUESDAY is Busy Day...");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY is Busy Day...");
			break;
		case THURSDAY:
			System.out.println("THURSDAY is Busy Day...");
			break;
		case FRIDAY:
			System.out.println("FRIDAY is Better Day...");
			break;
		case SATURDAY:
			System.out.println("SATURDAY is Nice Day...");
			break;
		case SUNDAY:
			System.out.println("Monday is Busy Day...");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		
//		String day = "TUESDAY";
		
		String day = new java.util.Scanner(System.in).nextLine().toUpperCase();
		
		try {
			EnumWeekDaysTest obj = new EnumWeekDaysTest(WeekDays.valueOf(day));
			obj.dayCheck();
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid Argument");
		}
		
		WeekDays weekDay = WeekDays.TUESDAY;
		System.out.println("Today is : "+weekDay);
	}

}
