package Operators;

import java.util.Scanner;

public class Swapniwtout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n=s.nextInt();
		System.out.println("Enter the second number:");
		int m=s.nextInt();
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println(n);
		System.out.println(m);
	

	}

}
