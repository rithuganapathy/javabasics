package basics;

public class Hdfc extends Bank {
	public void current() {
		System.out.println("hello");
	}
	
	public void salary() {
		System.out.println("world");
	}
	
	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
			obj.salary();
			obj.current();
			obj.savings();
	}
 
}


