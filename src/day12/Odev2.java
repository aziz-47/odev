package day12;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n 
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
		//t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z. 
		
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
