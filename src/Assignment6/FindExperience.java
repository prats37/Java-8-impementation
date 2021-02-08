package Assignment6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class FindExperience {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate joinDate = LocalDate.of(2019, Month.FEBRUARY, 4);
		Period p = Period.between(joinDate, today);
		System.out.println("My experience is :"+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days.");
		
	}
}
