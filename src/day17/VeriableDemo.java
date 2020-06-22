package day17;

public class VeriableDemo {
	  static int count= 0;
	  public void increment(){
		  
		  count++;
		  
	  }
	
	public static void main(String[] args) {
		
		VeriableDemo obj1= new VeriableDemo();
		VeriableDemo obj2= new VeriableDemo();
		obj1.increment();
		obj2.increment();
		System.out.println("obj1 : count is= " + obj1.count);
		System.out.println("obj2: count is= " + obj2.count);
	}

}
