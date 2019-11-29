public class OperatorDemo {
	
	// Arithmetic +, -, *, /, %	
			// + addition
			// - subtraction
			// * multiplication
			// / division
			// % modulus
	
	// Bitwise
	// Relational
	// Logical
	// Shorthand operators	
			// n++		// post increment
			// ++n		// pre increment
			// n--		// post decrement
			// --n		// post decrement
			// n += m
			// n -= m
	
	public static void main(String args[]) {
		
		
		/*
		  
		int m=6, n=4;
		int r1 = m+n;  //10
		int r2 = m-n;  //2
		int r3 = m*n;  //24
		double r4 = (double)m/n;  //1 	//type casting - explicit declaration
		int r5 = m%n;  //2
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		*/
		
		int m=4;
		int n=5;
		
		System.out.println("Before....");
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		
		//m=n;
		
		//n = n+m;
		
		//n += m;   // same as n=n+m
		
		//n = n-m;
				
		//n -= m;   // same as n=n-m
				
		//n++;		// same as n=n+1, n += 1
		
		//++n;		// same as n=n+1, n += 1
		
		//n += 1;	// same as n=n+1
		
		//n =+ 1;	// same as n=(+1)
		
		//m=++n;	// same as m=n+1, but here m=6, n=6 
		
		//m=n++;	// same as m=n+1, but here m=5, n=6 	
		
		//n--;		// same as n=n-1
		
		//--n;		// same as n=n-1	
		
		//n -= 1;		// same as n=n-1
		
		//n =- 1;	// same as n=(-1)
		
		//m=--n;	// same as m=n+1, but here m=4, n=4 
		
		//m=n--;	// same as m=n+1, but here m=5, n=4 
		
		System.out.println("After....");		
		System.out.println("m:"+m);
		System.out.println("n:"+n);
	}

}
