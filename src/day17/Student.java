package day17;

public class Student {
	
	static boolean isForeigner;// boolean da deger atamasi yapmazsak java defaul olarak false atar.
	//boolean larin default dgeri falsedir

	public static void main(String[] args) {
		
		String name = "Mike";
		int age= 22;
		//static char gender ;// m= male, f= female// statigin icinde static bir veriablae olustrumuyoruz. hatali yazilim
		//lokkal veriable oldugu icin deger atamasi yapilamsi alzim
		System.out.println(name + " ");
		System.out.println(age + " ");
		System.out.println(isForeigner + " ");
		//System.out.println(gender); // bunu yazmaz cunku hatali yazlim
;		
		
	}

}
 