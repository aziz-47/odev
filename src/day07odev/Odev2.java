package day07odev;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		        //Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n. 
				//Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		
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
