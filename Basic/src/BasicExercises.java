
public class BasicExercises {
	public static void main(String[] args) {
		
		int num = addMulti(1,2, false);
		int num1 = addMulti(1,2, true);
		System.out.println(num);
		System.out.println(num1);
		
		int num2 , num3, num4; 
		
		/*int num2 = zeroIncluded(2,2);
		int num3 = zeroIncluded(0,2);
		int num4 = zeroIncluded(1,0);
	
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4); */
		
		
		for (int i = 0 ; i < 10 ; i++) {	
			num2 = zeroIncluded(2,i);
			System.out.println(num2);
			
		}
		
		int xrray[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			xrray[i] = i; 
		}
		
		for (int i = 0 ; i < 10 ; i++) {	
			num3 = zeroIncluded(xrray[i],xrray[i]);
			System.out.println(num3 + " num3");
			
		}

		
		for (int arrayelement: xrray) {
	         System.out.println(arrayelement + " array");
	      }

		
		for (int i = 0; i < 10; i++) {
			xrray[i] = xrray[i] *10; 
			System.out.println(xrray[i] + " *10");
		}

		
		
		
	}
	
	
	static int addMulti(int a, int b , boolean x) {
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
	
	
	static int zeroIncluded(int a, int b) {
		if (a == 0 && b!=0) {
			return b; 
		}else if (b == 0 && a!=0){
			return a; 
		} else 
			return a + b;
	}
	
	
}
