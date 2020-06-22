package gungunodev;

import java.util.Scanner;

public class IfElseOdev04 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý alýn eðer sayýlarýn iþaretleri  ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		// Sayýlarýn iþaretleri  farklý ise ekrana “Farklý iþaretli” yazdýrýn.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kullanicidan 1.sayi alniz");
		double num1= scan .nextDouble();
		
		System.out.println("Kullanicidan 2. sayi aliniz");
		double num2= scan.nextDouble();
		
		if((num1<0 && num2<0) ||  (num1>0 && num2>0)){
			System.out.println("ayni isaretli");
		}else {
			System.out.println("farkli isretli");
		}
		
		


	}

}
