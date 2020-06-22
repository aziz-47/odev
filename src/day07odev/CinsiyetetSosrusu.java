package day07odev;

import java.util.Scanner;

public class CinsiyetetSosrusu {

	public static void main(String[] args) {
				
		//Kullanýcýdan cinsiyetini girmesini isteyin. 
		//Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn. 
    	//Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn. Kadin ise yasini kontrol edin.
    	//Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn. Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.

		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen cinsiyetinizi girniz");
		String cinsiyet= scan.next();
		
		System.out.println("Lutfen yasinizi girininiz");
		int yas = scan.nextInt();
		
		if(cinsiyet.equalsIgnoreCase("Erkek")) {
			if(yas<=18) {
				System.out.println("Erkek cocuk");
			}else if(yas>=18){
				System.out.println("Adam");
			}
		}else if(cinsiyet.equalsIgnoreCase("Kadin")) {
			
			if(yas<18) {
				System.out.println("kiz cocuk");
			}else if(yas>=18) {
				System.out.println("Kadin");
			}
		}
		
		
		scan.close();
				
		
	
	}

}
