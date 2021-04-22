import java.util.Scanner;

public class factorial {
	public static int fac(int number){
		if (number <= 1) {
			return 1;
		}else {
			return (number * fac(number-1)); // -1 because factorial function is (n-1) , n for number input
		  
	   }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Number of factorial : ");
		int number = fac(sc.nextInt()); /**var number = method (fac) scan the value that user entered */
		System.out.println(number);
	}
}
