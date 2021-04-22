public class recursion {

	public static void main(String[] args) { /** recursion */
		int result = sum(10);
    	System.out.println(result);
	}
	public static int sum(int a) { /** sum(10) (10+1) + (9+2) + ...(5+6) = 55 */
		if (a > 0) {
		  return a + sum(a - 1); /** 10 + sum(10-1) => 10 + (sum(9)) */
		} else {
		  return 0;
		}
	  }
}
