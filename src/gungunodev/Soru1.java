package gungunodev;

public class Soru1 {

	public static void main(String[] args) {
		//  1 ile 100 aras�nda 3, 5 ve her ikisi taraf�ndan b�l�nebilen say�lar� yazd�rmak i�in bir Java program� yaz�n. 
		
		System.out.println("\n 3 ile bolunen sayilar");
		for(int i=1; i<100; i++) {
			if(i%3==0);
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n 5 ile bolunen sayilar");
		 for(int i=1; i<100; i++) {
			 if(i%5==0);
			 System.out.print(i + " ");
		 }
		 
		 System.out.println("\n\n 3 ve 5 ile bolunen sayilar");
		 for(int i=1; i<100; i++) {
			 if(i%3==0 && i%5==0);
			 System.out.print(i + " ");
		 }
		 System.out.println("\n");
	}

}
