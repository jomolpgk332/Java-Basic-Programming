package controlstructures;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the digit ");
		int n=sc.nextInt();
		int t=0;
		int m=n%10;
		int a=n/10; 
		if(a!=1)
		{
			switch(m)
			{
		case 1:
		case 2:
		case 6:
			t=t+3;
			break;
		case 4:
		case 5:
		case 9:
			t=t+4;
			break;
		case 3:
		case 8:
		case 7:
			t=t+5;
			break;
			default:
				System.out.printf("invalid ");
			}
		switch(c)
		{
		case 2:
		case 3:
		case 8:
		case 9:
			t=t+6;
			break;
		case 4:
		case 5:
		case 6:
			t=t+5;
			break;
		case 7:
			t=t+7;
			break;
			default:
				System.out.printf("invalid ");
		}
		}
		else
		{
switch(a)
{
case 1:
case 2:
	t=t+6;
	break;
case 3:
case 4:
case 5:
case 6:

case 8:
case 9:
	t=t+8;
	break;
case 7:
	t=t+9;
	break;
default:
	System.out.printf("invalid ");
	
	
}
	}
		
		System.out.printf("t ");
		
}
}
