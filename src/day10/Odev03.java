package day10;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		//Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("ilk ve soyismini giriniz");
		
		String tamIsim= scan.nextLine();
		
		System.out.println(tamIsim.length()-1);
		
		scan.close();
		

	}

}
