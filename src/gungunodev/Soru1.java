package gungunodev;

public class Soru1 {

	public static void main(String[] args) {
		//  1 ile 100 arasýnda 3, 5 ve her ikisi tarafýndan bölünebilen sayýlarý yazdýrmak için bir Java programý yazýn. 
		
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
