package day21;

import java.util.Arrays;

public class Tekrar1 {

	public static void main(String[] args) {
		// 
		String str= "Ali Can okula basladi";
		
		String kelime[] = str.split(" ");
		System.out.println(Arrays.toString(kelime));
		System.out.println(kelime.length);
		
		String str2= "Kahramanmaraslilar";
		
		
		String harf[] = str2.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println(harf.length);
		
		
		
	}

}
