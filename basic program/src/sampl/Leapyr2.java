package sampl;

import java.util.Scanner;

public class Leapyr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
{
	System.out.println("Leap year");
	
}
else
{
	System.out.println("Not a leap  year");
}
	}

}
