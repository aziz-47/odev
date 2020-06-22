package day18;

public class Test3 {
	int x= 10;

	public static void main(String[] args) {// burda int x static olmamsmaisna karsi ogje olsutulup cagrilmis
		
		Test3 t3= new Test3();
		System.out.println(t3.x);
		
	}
	static {
		int x= 20;
		System.out.println(x + " ");
	}

}
