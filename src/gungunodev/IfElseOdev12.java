package gungunodev;

import java.util.Scanner;

public class IfElseOdev12 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn. 
		//0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir tam sayi giriniz");
		int num= scan.nextInt();
		
		if(num<0) {
			System.out.println("Negatif");
		}else if(num==0) {
			System.out.println("Notr");
		}else {
			System.out.println("Pozitif");
		}

	}

}
