package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		if(number==0 || number==1)
		{
			System.out.println("not prime");
			return;
		}
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.println("not prime");
				return;
			}
				
		}
		System.out.println("yes prime");
	}

}
