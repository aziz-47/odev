package day18;

public class Test5 {
	static int x= 10;

	public static void main(String[] args) { // burda x static oldugu icin her ikisi icin de ayni olur
		
		Test5 t1= new Test5();
		Test5 t2= new Test5();
		
		t1.x= 20;
		System.out.println(t1.x + " ");
		System.out.println(t2.x + " ");
		
		

	}

}
