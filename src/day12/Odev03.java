package day12;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden veya sonras�ndan   ba�lay�p biti� de�erinde veya �ncesinde biten
		//t�m �ift tamsay�lar� while loop kullanarak ekrana yazd�r�n�z. 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int baslangic= scan.nextInt();
		
		System.out.println("Bitis");
		int bitis = scan.nextInt();
		
		 int num= baslangic;
		 
		 while (num<bitis) {
			 
			 if(num%2==0) {
				 System.out.println(num + " ");
				 num++;
			 }
		 }
		 
		 scan.close();
		
		
			
		}
	

	}


