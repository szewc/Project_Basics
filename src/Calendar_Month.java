import java.text.DateFormatSymbols;
import java.util.*;
public class Calendar_Month {
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();		// creating a calendar object
		int today = cal.get(Calendar.DAY_OF_MONTH);				// get actual dates
		int month = cal.get(Calendar.MONTH);
		
		cal.set(Calendar.DAY_OF_MONTH, 1);						// setting cal to day 1
		int weekday = cal.get(Calendar.DAY_OF_WEEK);			// getting weekday name for day 1 (1-7)
		int firstDayOfWeek = cal.getFirstDayOfWeek();			// getting locale specific first day
		
		int indent = 0;
		while (weekday != firstDayOfWeek) {						// if day (day 1 in month in this case)
			indent++;											// != locale firstDayOfWeek,
			cal.add(Calendar.DAY_OF_MONTH, -1);					// indent
			weekday = cal.get(Calendar.DAY_OF_WEEK);
		}
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();	// locale names of weekdays
		
		do {
			System.out.printf("%4s", weekdayNames[weekday]);	// print day names with 4 spaces 
			cal.add(Calendar.DAY_OF_MONTH, 1);
			weekday = cal.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);					// final condition
		System.out.println();
		
		for (int i = 1; i <= indent; i++) {						// printing indent
			System.out.print("    ");
		}
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		do {
			int day = cal.get(Calendar.DAY_OF_MONTH);			// printing day + 3 spaces
			System.out.printf("%3d", day);
			
			if (day == today) {									// * for current day, else space
				System.out.print("*");
			}
			else System.out.print(" ");
			
			cal.add(Calendar.DAY_OF_MONTH, 1);					// moving on
			weekday = cal.get(Calendar.DAY_OF_WEEK);			// getting weekday to know
			if (weekday == firstDayOfWeek) {					// when to return
				System.out.println();
			}
		} while (cal.get(Calendar.MONTH) == month);				// print till the month ends
		
		if (weekday != firstDayOfWeek) {						// just in case
		System.out.println();
		}
	}
}