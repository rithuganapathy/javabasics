package basics;

public class One implements Sbi{
    public void savings() {
    	System.out.println("Savings acc");
}
    public void current() {
    	System.out.println("Current acc");
    }
    
    public static void main(String[]args) {
    	One obj = new One();
    	obj.savings();
    	obj.current();
    	
    }
}
