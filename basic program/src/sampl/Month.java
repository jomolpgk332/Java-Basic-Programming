package sampl;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the date");
		//int a=s.nextInt();
		String d=s.next();
		String str=" "+s.charAt(3)+s.charAt(4);
		switch(str)
		{
		case 01:
			System.out.println("January");
			break;
		case 02:
			System.out.println("February"); 
			break;
		case 03:
			System.out.println("March");
			break;
		case 04:
			System.out.println("April");
			break;
		case 05:
			System.out.println("May");break;
			
		case 06:
			System.out.println("June");
			break;
		case 07:
			System.out.println("July");
			break;
		case 08:
			System.out.println("August");
			break;
		case 09:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			default:
				System.out.println("invalid");
				
		}
	}

}
