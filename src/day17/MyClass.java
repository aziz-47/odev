package day17;

public class MyClass {
	
	int x= 3;       
	int y= 5;
	
	MyClass(){                                  ////Bu Cons.this olmad��� i�in a�ag�daki arg�menti DE��L
                                                  //class Variable'� kullan�r,x'i 3 al�r.x 1 artt�r�l�r 4 olur.
		x+=1;
		System.out.println("-x:" + x);
	}
	
	MyClass(int i){
		this();
		this.y=i;
		x+=y;
		System.out.println("-x:" + x);
		
	}
	
	MyClass(int i, int i2){
		this(3);
		this.x-=4;
		System.out.println("-x:" + x);
	}

	public static void main(String[] args) {
		MyClass mc1= new MyClass(4, 3);
		
		
		
	}

}
