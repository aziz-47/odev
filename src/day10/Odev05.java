package day10;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ismi Amerika ise ekrana USA,
		//Ingiltere ise ekrana UK, Almanya ise ekrana DE yazd�r�n. Di�er �lkeler i�in ise NA yazd�r�n. 
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Yasadiginiz ulkenin adini giriniz");
	    String ulke =scan.next().toLowerCase();
	    
	    switch(ulke){
	    case "amerika":
	    	System.out.println("USA");
	    	break;
	    case "ingiltere":
	    	System.out.println("Uk");
	    	break;
	    case "almanya":
	    	System.out.println("DE");
	    	break;
	    	default:
	    		System.out.println("NA");
	    	
	    	
	    }
	    scan.close();
		

	}

}
