public class SelectionDemo {
	
	public static void main(String args[]) {
		
		/*
		int n=7;
		
		if (n == 0)
		{				// curly brackets are required if we need to execute more than one statement
			System.out.println("The given number is zero");
			System.out.println("Bye");
		}				// curly brackets are required if we need to execute more than one statement	
		else if (n%2 == 0)
			System.out.println("The given number is even");
		
		else
			System.out.println("The given number is odd");	
			
		*/
		
		// ternary operator 
		// ?: -> condition?exp1:exp2
		
		/*
		int i=8;
		int j=0;
		
		if (i>6)
			j=1;
		else
			j=2;
		
		System.out.println(j);
		*/
		
		/*
		int i=8;
		int j=0;
		
		j= i>6?3:2;		// ternary operator 
		
		System.out.println(j);
		
		*/
		
		//int n=4;					// Int can be used in switch 
		char n=65;					// Char can be used in switch, where if numeric character is passed
									// it will be converted to character as per ascii
		/*
		ASCII code of    is: 32
		ASCII code of  ! is: 33
		ASCII code of  " is: 34
		ASCII code of  # is: 35
		ASCII code of  $ is: 36
		ASCII code of  % is: 37
		ASCII code of  & is: 38
		ASCII code of  ' is: 39
		ASCII code of  ( is: 40
		ASCII code of  ) is: 41
		ASCII code of  * is: 42
		ASCII code of  + is: 43
		ASCII code of  , is: 44
		ASCII code of  - is: 45
		ASCII code of  . is: 46
		ASCII code of  / is: 47
		ASCII code of  0 is: 48
		ASCII code of  1 is: 49
		ASCII code of  2 is: 50
		ASCII code of  3 is: 51
		ASCII code of  4 is: 52
		ASCII code of  5 is: 53
		ASCII code of  6 is: 54
		ASCII code of  7 is: 55
		ASCII code of  8 is: 56
		ASCII code of  9 is: 57
		ASCII code of  : is: 58
		ASCII code of  ; is: 59
		ASCII code of  < is: 60
		ASCII code of  = is: 61
		ASCII code of  > is: 62
		ASCII code of  ? is: 63
		ASCII code of  @ is: 64
		ASCII code of  A is: 65
		ASCII code of  B is: 66
		ASCII code of  C is: 67
		ASCII code of  D is: 68
		ASCII code of  E is: 69
		ASCII code of  F is: 70
		ASCII code of  G is: 71
		ASCII code of  H is: 72
		ASCII code of  I is: 73
		ASCII code of  J is: 74
		ASCII code of  K is: 75
		ASCII code of  L is: 76
		ASCII code of  M is: 77
		ASCII code of  N is: 78
		ASCII code of  O is: 79
		ASCII code of  P is: 80
		ASCII code of  Q is: 81
		ASCII code of  R is: 82
		ASCII code of  S is: 83
		ASCII code of  T is: 84
		ASCII code of  U is: 85
		ASCII code of  V is: 86
		ASCII code of  W is: 87
		ASCII code of  X is: 88
		ASCII code of  Y is: 89
		ASCII code of  Z is: 90
		ASCII code of  [ is: 91
		ASCII code of  \ is: 92
		ASCII code of  ] is: 93
		ASCII code of  ^ is: 94
		ASCII code of  _ is: 95
		ASCII code of  ` is: 96
		ASCII code of  a is: 97
		ASCII code of  b is: 98
		ASCII code of  c is: 99
		ASCII code of  d is: 100
		ASCII code of  e is: 101
		ASCII code of  f is: 102
		ASCII code of  g is: 103
		ASCII code of  h is: 104
		ASCII code of  i is: 105
		ASCII code of  j is: 106
		ASCII code of  k is: 107
		ASCII code of  l is: 108
		ASCII code of  m is: 109
		ASCII code of  n is: 110
		ASCII code of  o is: 111
		ASCII code of  p is: 112
		ASCII code of  q is: 113
		ASCII code of  r is: 114
		ASCII code of  s is: 115
		ASCII code of  t is: 116
		ASCII code of  u is: 117
		ASCII code of  v is: 118
		ASCII code of  w is: 119
		ASCII code of  x is: 120
		ASCII code of  y is: 121
		ASCII code of  z is: 122
		ASCII code of  { is: 123
		ASCII code of  | is: 124
		ASCII code of  } is: 125
		ASCII code of  ~ is: 126
		*/		
		
		//double n=4.4;				// Double cannot be used switch
		//String n="Srinivasan";	// String can be used in switch in versions of java above 1.7 
				
		//System.out.println(n);
		
		/*
		if (n==1)
				System.out.println("One");
		else if (n==2)
				System.out.println("Two");
		else if (n==3)
				System.out.println("Three");
		else if (n==4)
				System.out.println("Four");
		else if (n==5)
				System.out.println("Five");
		else if (n==6)
				System.out.println("Six");
		else if (n==7)
				System.out.println("Seven");
		else if (n==8)
				System.out.println("Eight");
		else if (n==9)
				System.out.println("Nine");
		else if (n==10)
				System.out.println("Ten");
		*/
		
		switch(n)
		{
		 	case (1):
				System.out.println("One");
				break;
			case (2):
				System.out.println("Two");
				break;
			case (3):
				System.out.println("Three");
				break;
			case (4):
				System.out.println("Four");
				break;
			case (5):
				System.out.println("Five");
				break;
			case (6):
				System.out.println("Six");
				break;
			case (7):
				System.out.println("Seven");
				break;
			case (8):
				System.out.println("Eight");
				break;
			case (9):
				System.out.println("Nine");
				break;
			case (10):
				System.out.println("Zero");	
				break;
			case ('A'):
				System.out.println("Alphabet A");	
				break;
		 /*	case ("Srinivasan"):			
				System.out.println("The input string is my name");	
				break;*/
			default:
				System.out.println("Invalid Number");	
		}
			
				
	}

}
