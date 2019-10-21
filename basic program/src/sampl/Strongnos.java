package sampl;

import java.util.Scanner;

public class Strongnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int z=s.nextInt();
		//n=n%10;
		
		
		 int b=z;
		 int r;
		double sum=0;
		while(z!=0)
		{
			int fact=1;
			r=z%10;
			for(int i=1;i<=r;i++)
			{
			
			 fact= fact* i;	
			}
			sum=sum+fact;
			z=z/10;
		}
		if(sum==b)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("not strong");
		}
	}

}
