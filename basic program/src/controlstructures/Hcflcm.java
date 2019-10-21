package controlstructures;

import java.util.Scanner;
public class Hcflcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		int lcm=0;
		int max;
		max=(a>b)?a:b;//ternary or conditional opr
		for(int i=max;;i++)
		{
			if(i% a==0 && i %b==0)
			{
				lcm=i;
				break;
			}
		
	}
		System.out.println(lcm);

}
}




