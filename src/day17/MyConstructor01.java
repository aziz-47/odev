package day17;

public class MyConstructor01 {
	
	int x= 5;
	
	MyConstructor01(){
		System.out.println("-x: " + x);
		
	}
	
	MyConstructor01(int x){
		this();
		System.out.println("-x: " + x);
	}

	public static void main(String[] args) {
		MyConstructor01 mc1= new MyConstructor01(4);
		MyConstructor01 mc2= new MyConstructor01();
		
		
		// burda this () oldugu icin oncelile parametresiz constrotor calisacak. sonra tek pamrametreli cons caliscak,
		// en son tkrar parametresiz calisacak. cunku obje olsuturp cagrilmis 
		
	}

}
