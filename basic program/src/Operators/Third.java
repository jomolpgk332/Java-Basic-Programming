package Operators;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int n=s.nextInt();
	 
	 int b=n%10;
	 int c=n/10;
	 int d=b*c;
	 int e=c*c;
	 
	 System.out.println(d+""+e);
	 
	}

}
