package Programs;

import java.util.Scanner;

public class ArmstronhNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int n,r,sum=0;
		n=number;
		while(n>0)
		{
			r=n%10;
			sum= sum +(r*r*r);
			n=n/10;
		}
		if(number==sum)
		System.out.println("Armstrong number");
		else
		System.out.println("Not armstrong");
	}

}
