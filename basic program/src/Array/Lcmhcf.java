package Array;

import java.util.Scanner;

public class Lcmhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		int min;
		min=(a<b)?a:b;
		int gcd=0;
		for(int i=min;i>0;i--)
		{
			if(a%i==0 && b%i==0) {
				gcd=i;
				break;
			}
		}
		System.out.println(gcd);
		
	}

}
