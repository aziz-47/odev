package day12;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� 
		//de�erinden ba�lay�p biti� de�erinde  biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini aliniz");
		int baslangic=scan.nextInt();
		
		System.out.println("Bitis degerini aliniz");
		int bitis= scan.nextInt();
		
		int num= baslangic;
		int sum= 0;
				
		while(num<=bitis) {
			sum+=num;
			System.out.println(num + " ");
			num++;
		}System.out.println("sum:" + num);
		
		
		scan.close();


	}

}
