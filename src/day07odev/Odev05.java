package day07odev;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		 // Kullanicidan password girmesini isteyin
        // Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
        // Cift sayi ise ekrana "Password tamam" yazdirin, Tek sayi ise "Tekrar deneyin ilk" yazdirin
        // Password 4 basamakli degil ise "Tekrar deneyin son" yazdirin
        
        // 4 basamakli demek 999 dan buyuk 10000 den kucuk demektir.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Password giriniz");
		 int password= scan.nextInt();
		 
		 if(password>999 && password<10000) {
			 
			 if(password%2==0) {
				 System.out.println("password tamam");
			 }else if(password%2!=0) {
				 System.out.println("Tekrar deneyin ilk");
			 }
			 
		 }else {
			 System.out.println("tekrar deneyin son");
		 }
        

	}

}
