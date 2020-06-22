package day16;

public class Constructor03 {
	String isim= "Zafer";
	int yas=5;
	int kilo= 20;
	int boy= 120;
	boolean emekli= false;
	
	
	Constructor03(){
		this.isim= isim;
		this.yas= yas;
		this.kilo= kilo;
		this.boy= boy;
		this.emekli= false;
	}
	
	Constructor03(String isim, int yas ){
		this.isim=isim;
		this.yas= yas;
	}
	

	public static void main(String[] args) {
		
		Constructor03 insan01= new Constructor03();
		System.out.println("isim :" + insan01.isim);
		
		Constructor03 insan02= new Constructor03("Zeyenep" , 2);
		System.out.println("isim: " + insan02.isim);
		System.out.println("yas: " +insan02.yas);
				
		
	}
	
	


}
