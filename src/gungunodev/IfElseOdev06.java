package gungunodev;

import java.util.Scanner;

public class IfElseOdev06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl alýn 
				//eðer yýl 1000’e bolunuyorsa ekrana “Milenyum” yazdýrýn.
				//Eðer yýl 100’e bolunuyorsa ekrana “Yüzyýl” yazdýrýn.
				//Eðer yýl 10’a bolunuyorsa ekrana “Onyýl” yazdýrýn.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("kullanicidan bir yil isteyiniz");
		int yil= scan.nextInt();
		
		if(yil%1000==0) {
			System.out.println("millenyum");
		}else if(yil%100==0) {
			System.out.println("yuzyil");
		}else if(yil%10==0) {
			System.out.println("onyil");
		}else {
			System.out.println("herhangi bir yil ");
		}
		

	}

}
