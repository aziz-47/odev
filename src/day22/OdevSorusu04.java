package day22;

import java.util.Arrays;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
		//for-each loop kullanarak yazdýrýnýz. Ýpucu: split()
		
		
		String str= "Yunanistan cok sicak";
		
		String harf[] = str.split("");
		
		for(String w: harf ) {
			System.out.println(w);
		}
		
		

	}

}
