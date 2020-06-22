package day08;

import java.util.Scanner;

public class DikdotrgenSorusu {

	public static void main(String[] args) {

 
              //Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eþit ise ekrana “Kare” 
	          //farklý ise ekrana “Dikdörtgen” yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Diktortgenin enini giriniz");
		double en = scan.nextDouble();
		
		System.out.println("Dikdortgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		
	String result=	(en==boy) ? "Kare"  : "Dikdortgen";
	System.out.println(result);
	
	
	scan.close();
		
	
	}

}
