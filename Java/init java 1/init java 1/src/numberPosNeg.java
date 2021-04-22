import java.util.Scanner;
public class numberPosNeg {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i = 0, j = 0;
		int positiveCount = 0, negativeCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		while (i < Size)
		{
			a[i] = sc.nextInt();
			i++;
		}   

		while (j < Size)
		{
			if(a[j] >= 0)
			{
				positiveCount++;
			}
			else
			{
				negativeCount++;
			}
			j++;
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + positiveCount);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
	}
}