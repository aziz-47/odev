package day07odev;

import java.util.Scanner;

public class CinsiyetetSosrusu {

	public static void main(String[] args) {
				
		//Kullan�c�dan cinsiyetini girmesini isteyin. 
		//Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n. 
    	//Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n. Kadin ise yasini kontrol edin.
    	//Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n. Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.

		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen cinsiyetinizi girniz");
		String cinsiyet= scan.next();
		
		System.out.println("Lutfen yasinizi girininiz");
		int yas = scan.nextInt();
		
		if(cinsiyet.equalsIgnoreCase("Erkek")) {
			if(yas<=18) {
				System.out.println("Erkek cocuk");
			}else if(yas>=18){
				System.out.println("Adam");
			}
		}else if(cinsiyet.equalsIgnoreCase("Kadin")) {
			
			if(yas<18) {
				System.out.println("kiz cocuk");
			}else if(yas>=18) {
				System.out.println("Kadin");
			}
		}
		
		
		scan.close();
				
		
	
	}

}
