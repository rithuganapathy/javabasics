package Basic1;

public class Conditional {
	public static void main(String[]args) {
		int age = 21;
		if(age<12) {
			System.out.println("kid");
		}
		else if (age<19 && age>12) {
			System.out.println("Teenage");
		} else {
			System.out.println("adult");
		}
	}

}
