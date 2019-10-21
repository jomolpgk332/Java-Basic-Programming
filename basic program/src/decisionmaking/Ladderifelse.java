package decisionmaking;

import java.util.Scanner;

public class Ladderifelse 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your blood group:");
		
		String b=s.next();
		if(b.equals("A")) 
		{
			
			if(b.equals("a+")) {
				System.out.println("your blood group is A+");		
			}
			else {
				System.out.println("Your blood group is A");
			}
		}
			else if(b.equals("B")) {
				if(b.equals("b+")) {
					System.out.println("your blood group is B+");		
				}
				else {
					System.out.println("your blood group is B");
				}
			}
			else {
				System.out.println("SORRY");
			}
		
	}

}

