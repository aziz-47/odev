package day14;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		// Kullanıcıya bir String girmesini söyleyin ve 
		//bu String’in ilk harﬁ ile son harﬁ aynı ise ekrana  “Simetrik” yazdırın.
		//Aynı değilse tekrar bir String girmesini isteyin
		
		String str;
		int length;
		char ilk ;
		char son;
		
		do {
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir kelime veya bir cümle giriniz");
	str = scan.nextLine();
	
		length = str.length()-1;
		ilk = str.charAt(0);
		son = str.charAt(length);
	
	    if(ilk == son) {
		  System.out.println("Simetrik");
		}else {
			System.out.println("Tekrar bir string giriniz");
		}

	}while(ilk !=son);
		
		
		
	}
	

}
