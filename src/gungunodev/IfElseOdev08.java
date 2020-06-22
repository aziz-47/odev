package gungunodev;

import java.util.Scanner;

public class IfElseOdev08 {

	public static void main(String[] args) {
		//Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn
				//eðer üç kenar uzunluðu birbirine eþit ise 
				//ekrana “Eþkenar üçgen” yazdýrýn.
				// Sadece iki kenar uzunluðu birbirine eþit ise
				//ekrana “Ikizkenar üçgen” yazdýrýn
				//Tüm kenar uzunluklarý birbirinden farklý ise
				//“Çeþitkenar üçgen yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("ucgenin 1 kenar uzunlugu isteuyiniz");
		int num1= scan.nextInt();
		System.out.println("ucgenin 2 kenar uzunllugu isteyiniz");
		int num2 = scan.nextInt();
		System.out.println("ucgenin 3. kenar uzunlugu isteuyiniz");
		int num3= scan.nextInt();
		
		if(num1==num2 && num1==num3) {
			System.out.println("eskenar  ucgen");
		}else if(num1==num2 && num1!=num3) {
			System.out.println("ikizkenar ucgen");
		}else {
			System.out.println("cesitkenar ucgen");
		}
		
		
		
		


	}

}
