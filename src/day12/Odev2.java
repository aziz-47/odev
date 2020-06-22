package day12;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 
		//tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz. 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini aliniz");
		int baslangic=scan.nextInt();
		
		System.out.println("Bitis degerini aliniz");
		int bitis= scan.nextInt();
		
		
		if(baslangic<=bitis) {
			int num= baslangic;
			while(num<= bitis) {
				System.out.print(num+ " ");
				num++;
			}
		}else {
			int num= baslangic;
			while(num>=bitis) {
				System.out.print(num+ " ");
				num++;
			}
		}
		
		scan.close();
		
		
		
	
	}
}
