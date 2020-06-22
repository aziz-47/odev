package day09;

public class Tekrar01 {

	public static void main(String[] args) {
		  // A harfini bulunca "Ilk harf", B harfini bulunca "Ikinci harf"
        // C harfini bulunca "Ucuncu harf", D harfini bulunca "Dorduncu harf"
        // yazdiran programi if else if() ve switch() kullanarak yaziniz.
        // digerleri icin "Bilmiyorum"
		
		
		char harf='D';
		switch (harf) {
		case 'A':
			System.out.println("ilk harf");
			break;
		case 'B':
			System.out.println("ikinci harf");
			break;
		case 'C':
			System.out.println("ucuncu harf");
			break;
		case 'D':
			System.out.println("dorduncu harf");
			break;
			default:
			System.out.println("bilmiyorum");
			
			
		}
		

	}

}
