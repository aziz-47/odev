package day22;

import java.util.Arrays;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
		//for-each loop kullanarak yazd�r�n�z. �pucu: split()
		
		
		String str= "Yunanistan cok sicak";
		
		String harf[] = str.split("");
		
		for(String w: harf ) {
			System.out.println(w);
		}
		
		

	}

}
