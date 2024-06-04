package basics;

public class Students {
	public void studentdetails(String name) {
		System.out.println(name);
	}
	public void studentdetails(short age) {
		System.out.println(age);
		}
	public void studentdetails(int userid) {
		System.out.println(userid);
	}
	public void studentdetails(char initial) {
		System.out.println(initial);
	}
	public static void main(String[]args) {
		Students obj = new Students();
		obj.studentdetails("Ritu");
		obj.studentdetails(23);
		obj.studentdetails(21);
		obj.studentdetails('G');
		
		
	}

}
