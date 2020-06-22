package day16;

public class Constructor02 {

	public static void main(String[] args) {
		
		
		Constructor01 hondaCivik01= new Constructor01();
		System.out.println("isim: " + hondaCivik01.isim.replace("Honda", "Toayata"));
		System.out.println("price: " + (hondaCivik01.price + 2000));

	}

}