package gungunodev;

import java.util.Scanner;

public class IfElseOdev03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý alýn eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
				// 3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir tam sayi aliniz");
		int sayi= scan.nextInt();
		
		if(sayi%3==0) {
			System.out.println(" 3'un kati");
		}else {
			System.out.println(" 3'un kati degil");
		}

	}

}
