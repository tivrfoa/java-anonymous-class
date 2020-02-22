
// https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

public class AnonymousClass1 {

	public static void main(String[] args) {
		System.out.println("Nice");
		
		c1 c = new c1();
		System.out.println(c.getClass().getName());
		
		System.out.println("---------------------------------");
		
		c1 ac = new c1() {
			{
				m1();
				System.out.println(m2());
				newM();
			}
			
			// you can declare new methods, but you will only be able
			// to call them from inside the anonymous class expression.
			void newM() {
				System.out.println("I'm a new method!");
			}
		};
		
		System.out.println(ac.getClass().getName());
	}

}

class c1 {
	
	c1() {
		System.out.println("c1 constructor");
	}
	
	String m1() {
		System.out.println("c1 m1");
		System.out.println(getClass().getName());
		
		return "c1 m1";
	}
	
	int m2() {
		return 33;
	}
}
