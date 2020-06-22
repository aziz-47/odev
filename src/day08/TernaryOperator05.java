package day08;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// Kullanicidan bir character girmeini isteyiniz
				//charcter harf ise kucuk harf olup olmadigni kontrol ediniz
				//kucuk harf ise ekrana "kucuk harf yazdiriniz"
				// buyuk harf ise ekrana buyuk harf yazdirniniz
				// harf egilse erkrna harf degildir yazdiniz
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Bir character giriniz");
		char ch= scan.next().charAt(0);
		
	String result=	((ch>=97 && ch<=122) || (ch>=65 && ch<=95)) ? 
			((ch>=97 && ch<=122) ? "kucuk harf": "buyuk harf") : "harf degildir"; 
			System.out.println(ch + " " + result + "dir");
			
			scan.close();

	}

}
