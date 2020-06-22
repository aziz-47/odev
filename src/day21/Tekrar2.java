package day21;

import java.util.Arrays;

public class Tekrar2 {

	public static void main(String[] args) {
		// // Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
		// Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
		
		
		String str= "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		
		str= str.replace(" ", "");
		
		String harf[]= str.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println(harf.length);
		
		
		String str2= "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		
	String kelime[]	=str2.split(" ");
	System.out.println(Arrays.toString(kelime));
	
	int boslukSayisi= kelime.length-1;
	System.out.println(boslukSayisi);
	
	String character[]= str2.split("");
	System.out.println(character.length-boslukSayisi);
		
		

	}

}
