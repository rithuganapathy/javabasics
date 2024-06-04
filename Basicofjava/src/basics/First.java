package basics;

public class First {

	public void name() {
		System.out.println("shree");
	}
	public void age() {
		System.out.println(24);
	}
	public void mobile() {
		System.out.println(679678996);
	}
	public static void main(String[]args){
		System.out.println("Hello World!!!");		
		//classname objnaame  = new classname();
		First obj = new First();
		obj.name();
		obj.age();
		obj.mobile();
	}
}
