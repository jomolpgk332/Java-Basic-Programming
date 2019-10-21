package Operators;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n=s.nextInt();
		System.out.println("Enter the second number:");
		int m=s.nextInt();
		System.out.printf("Sum is: %d\n",n+m);
		System.out.printf("Difference is: %d\n",n-m);
		System.out.printf("Product is: %d\n",n*m);
		System.out.printf("Quotient is: %d\n",n/m);
		System.out.printf("Remainder is: %d\n",n%m);
		
		
	}

}
