
public class HelloWorld {
	public static void main(String[] args) {
		String heyyo = "Hello world !"; 
		System.out.println(heyyo);
		System.out.println("hello world");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		HelloWorld hey = new HelloWorld();
		int a, b, c, d;
		a = hey.addition(11, 2);
		b = hey.sub(11, 2);
		c = hey.divide(11, 2);
		d = hey.multi(11, 2);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int addition2(int a, int b , boolean x) {
		int c = 0; 
	
		if (x) 
		{
			c = a + b;
		} 
		else 
		{
			c = a * b; 
		}
		
		return c;
	}
		
		
		
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multi(int a, int b) {
		int c = a * b;
		return c;
	}

	public int divide(int a, int b) {
		int c = a / b;
		return c;
	}

}
