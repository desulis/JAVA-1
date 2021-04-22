public class harshad { // Example : The number 18 is a Harshad number in base 10, because the sum of the digits 1 and 8 is 9 (1 + 8 = 9), and 18 is divisible by 9 (since 18 % 9 = 0)
	static int digitSum(int number) {
		int sum = 0;
		// System.out.println("sum = " + sum + " number = " + number + " last = " + (number % 10));
		while (number > 0) {
			sum += number % 10; //
			number /= 10;
			// System.out.println("sum = " + sum + " number = " + number + " last = " + (number % 10));
		}
		return sum;
	}
	static boolean isHarshad(int number) {
		return number % digitSum(number) == 0;
	}

	public static void main(String[] args) {
		// System.out.println("sum = " + digitSum(197));
		for (int i = 1; i < 101; i++) {
			if(isHarshad(i)) {
				System.out.println(i + " ");
			}
		}
	}
}