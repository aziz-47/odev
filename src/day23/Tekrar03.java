package day23;

import java.time.LocalDate;

public class Tekrar03 {

	public static void main(String[] args) {
		
	LocalDate date= LocalDate.now();
	System.out.println(date);
	
	System.out.println(date.plusDays(2));	
	System.out.println(date.plusWeeks(3));
	System.out.println(date.plusMonths(1));
	System.out.println(date.plusYears(1));
	
	
	System.out.println(date.minusDays(1));
	System.out.println(date.minusWeeks(1));
	
	
	
	
	
	
	
	
	
	
	}

}
