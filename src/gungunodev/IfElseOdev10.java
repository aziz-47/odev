package gungunodev;

import java.util.Scanner;

public class IfElseOdev10 {
	
	public static void main (String [] args) {
		//Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, e� den biri ise ekrana �Sessiz harf� yazd�r�n.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kullanicidan bir harf isteyiniz");
		String harf=scan.nextLine();
		
		if(harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u")){
			System.out.println("Sesli harf");
		}else if(harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("e")) {
			System.out.println("Sessiz harf");
		}else {
			System.out.println("Diger harfler");
		}

		
		

		
	}

}
