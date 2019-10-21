package decisionmaking;

import java.util.Scanner;

public class Secondifelseis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your mark:");
		int n=s.nextInt();
		if(n>90)
		{
			System.out.println("grade A+");
		}
		else if (n<90 && n>80)
		{
			System.out.println("grade A");
		}
		else if (n>80 && n<75)
		{
			System.out.println("grade B+");
		}
		else if (n>75 && n<70)
		{
			System.out.println("grade B");
		}
		else if (n>70 && n<65)
		{
			System.out.println("grade C+");
		}
		else if (n>65 && n<60)
		{
			System.out.println("grade C");
		}
		else if (n>65 && n<60)
		{
			System.out.println("grade C");
		}
		else 
		{
			System.out.println("Failed");
		}


	}

}
