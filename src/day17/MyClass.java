package day17;

public class MyClass {
	
	int x= 3;       
	int y= 5;
	
	MyClass(){                                  ////Bu Cons.this olmadýðý için aþagýdaki argümenti DEÐÝL
                                                  //class Variable'ý kullanýr,x'i 3 alýr.x 1 arttýrýlýr 4 olur.
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
