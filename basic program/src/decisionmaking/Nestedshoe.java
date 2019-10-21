package decisionmaking;

import java.util.Scanner;

public class Nestedshoe {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your shoe:");
		
		String shoe=s.next();
		System.out.println("Choose your shoe color:");
		
		String color=s.next();
		s.nextLine();
		System.out.println("Choose your shoe size:");
		int size=s.nextInt();
		if(shoe.equals("shoe"))
		{
			
			if(color.equals("red"));
			{
				if(size==10)
					System.out.println("Successfully purchased");
				else 
					System.out.println("Not size 10");
			}
			System.out.println("Not red");
			}
				
		System.out.println("Not ");	
			}
	}
	
	
	
