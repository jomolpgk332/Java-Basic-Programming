package decisionmaking;

import java.util.Scanner;

public class Ifstmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int n=s.nextInt();
		if(n>=18)
		{
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not elgible");
		}

	}

}
