package day17;

public class MyClass01 {
	
	int x;
	static int y;
	
	MyClass01() {
		x+=1;
		y+=1;
		
	}
	

	public static void main(String[] args) {
		new MyClass(2);
		MyClass mc = new MyClass(3);
		System.out.println(mc.x + " , " + mc.y);
		
		
		
	}

}
