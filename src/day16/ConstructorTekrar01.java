package day16;

public class ConstructorTekrar01 {
	
	String isim= "Zafer eke";
	int yas = 5;
	int boy= 115 ;
	String meslek= "ogrenci";
	boolean ogrenci= false;
	
	
	ConstructorTekrar01(){
		
	}
	
	ConstructorTekrar01( String isim, int yas, int boy){
		this.isim= isim;
		this.boy=boy;
		this.yas= yas;
	}
	
	ConstructorTekrar01(boolean meslek){
		this.ogrenci= ogrenci;
	}
			
	

	public static void main(String[] args) {
		
		ConstructorTekrar01 insan01= new ConstructorTekrar01() ;
		System.out.println("Isim: " +  insan01.isim);
		System.out.println("yas :"+ insan01.yas);
		System.out.println("boy :" + insan01.boy);
		System.out.println("meslek: " + insan01.meslek);
		System.out.println( "ogrenci :" + insan01.ogrenci);
		
		
		ConstructorTekrar01 insan02= new ConstructorTekrar01("zeynep" , 2, 70);
		System.out.println(insan02.isim);
		System.out.println(insan02.yas);
		System.out.println(insan02.boy);
		
		
		
		
		
		
		
			
		
				
		

	}

}
