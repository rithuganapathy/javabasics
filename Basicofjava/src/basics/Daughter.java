package basics;

public class Daughter extends Father{
	public void value() {
		System.out.println("Kar 4857 25 k");
	}
	
	public static void main(String[]args) {
		Father obj = new Father();
		Daughter obj1 = new Daughter();
		obj.bussiness();
		obj1.value();
		
		
		
	}

}
