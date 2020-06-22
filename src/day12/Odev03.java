package day12;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden veya sonrasýndan   baþlayýp bitiþ deðerinde veya öncesinde biten
		//tüm çift tamsayýlarý while loop kullanarak ekrana yazdýrýnýz. 
		
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


