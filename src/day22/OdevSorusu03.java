package day22;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// �ki String array olu�turunuz ve bu array�lerdeki ortak elemanlar� For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazd�r�n�z.  Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z 
		
		String arr1[]= {"Ali", "Ayse","Hakan", "Zafer"};
		String arr2[]= {"Zeynep", "Ali", "Zafer", "Burak"};
		
		int count=0;
		
		for(String w: arr1) {
			for(String z: arr2) {
				if(w==z) {
					System.out.println(w);
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("Ortak eleman yok");
			
		}

	}

}
