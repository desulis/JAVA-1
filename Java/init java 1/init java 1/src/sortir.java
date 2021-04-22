public class sortir  {
	public static int a = 1;
	public static int b = 2;
	public static int c = 3;
	public static int i;
	public static void main(String [] String) {
		System.out.println("a = " + a + " b = " + b + " c = " + c );
		if( a > b ) {
			i = b;
			b = a;
			a = i;
		}
		// System.out.println("a = " + a + " b = " + b + " c = " + c );
		if ( b > c) {
			i = c;
			c = b;
			b = i;
		}
		if (a > b) {
			i = b;
			b = a;
			a = i;
		}
		System.out.println("a = " + a + " b = " + b + " c = " + c );

	}
	
}
