package Assignment5;

import java.time.LocalDate;

public class FindSecondSundayOfNextMonth {
	
	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		LocalDate nextMonthFirstDay=currentDate.plusMonths(1).withDayOfMonth(1);
		int currDay=nextMonthFirstDay.getDayOfWeek().getValue();
		int reqPlus=(7-currDay)+7;
		LocalDate reqDate=nextMonthFirstDay.plusDays(reqPlus);
		System.out.println(reqDate);
		
	}

}
