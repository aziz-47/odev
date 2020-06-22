package day07odev;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		        //Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn. 
				//Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		
		
	      Scanner scan= new Scanner (System.in);
	      System.out.println("Kullanicidan bir character alin");
	      char harf= scan.next().charAt(0);
	      
	      if(harf>=97 && harf<=122 || harf>=65 && harf<=95) {
	    	  System.out.println("harf");
	      }else {
	    	  System.out.println("harf  degildir");
	      }
	      
	      scan.close();
		 
				
	}

}
