package day12;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden 
		//ba�lay�p biti� de�erinde  biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini aliniz");
		int baslangic=scan.nextInt();
		
		System.out.println("Bitis degerini aliniz");
		int bitis= scan.nextInt();
		
		int num= baslangic;
		 int product=1;
		 
		 while(num<=bitis) {
			 product*=num;
			 num++;
		 }System.out.println(product);
		 
		 
		 scan.close();

	}

}
