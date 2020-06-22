package day18;

public class Test6 {
       int x= 10;
       
	public static void main(String[] args) {// burda x static olmadigindan dolayi ilgili degisiki sadece obje ile ilgili olur
		
		Test6 t1= new Test6();
		Test6 t2= new Test6();
		
		t1.x= 20;
		System.out.println(t1.x + " ");
		System.out.println(t2.x + " ");
	}

}
