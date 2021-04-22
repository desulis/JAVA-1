import java.util.Scanner;

public class metropole {
		
	public static void main(String[] args) {
		double taxeMoyParHab;
		boolean isCapital;
		int nbrOfPeople;

		Scanner sc = new Scanner(System.in);
		System.out.print(" Number of citizen : ");
		int habitation = sc.nextInt();
		System.out.print("Total tax : ");
		double taxes = sc.nextDouble();
		isCapital = habitation >= 100000;
		System.out.println("Is it capital : " + isCapital);
		boolean isMetropole = isCapital && taxes >= 720000000;
		System.out.println("Is it metropole : " + isMetropole);			
	}
}
