package day15;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// do_while kullanarak bir oyun tasarlay�n
		
		
		//A�a��daki �rnek, Say�lar� Tahmin Et oyununu uygulamak i�in bir do while d�ng�s� kullan�r.
		//Program, kullan�c�n�n numaray� tahmin etmesi gerekti�i kadar deneme yapar.
		
		int num;      // rastgele sayi tutmak
	      int sanirim;    // kullanici tarafindan tahmin edilen numatrayi tutmak
	      

	     
	      Scanner scan = new Scanner(System.in);

	      // 1 ile 100 arasinda rastgele bir sayi alin
	      num = (int) (Math.random() * 100) + 1;
	      
	      
	      do
	      {
	         System.out.print("1 ile 100 arasinda bir tam sayi girin: ");
	         sanirim = scan.nextInt();

	         if (sanirim == num)
	         {
	            System.out.println("Dogru numarayi tahmin ettiniz.");
	         }
	         else if (sanirim < num) {
	         
	            System.out.println("Tahmininz sayidan daha dusuk. Tekrar deneyin!");
	                
	         }
	         else {
	         
	            System.out.println(
	                "Tahmininiz sayidan daha yuksek.Tekrar deneyin!");
	         }
	      }
	      while (sanirim != num);
	      
	      scan.close();
	      
	    

	}
	

}
