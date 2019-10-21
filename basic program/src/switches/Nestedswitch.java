package switches;

import java.util.*;

public class Nestedswitch 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the hotel:1)A\n2)B\n3)C");
		
		System.out.println("Choose your food:");
		char f=s.next().charAt(0);
		switch(f) 
		{
		case 'A':
			switch(f)
			{
			     case 'v':
				    System.out.printf("appam,vegetable");
				break;
			    case 'n':
				    System.out.println("appam,beef");
				break;
				default:
				
					System.out.println("invalid");
				
			}
		case 'B':
			switch(f)
			{
			case 'v':
				System.out.println("idli,sambar");
				break;
			case 'n':
				System.out.println("biriyani");
				break;
				default:
				
					System.out.println("invalid");

	}
		case 'C':
			switch(f)
			{
			case'v':
				System.out.println("lunch, sambar");
				break;
			case'n':
				System.out.println("lunch with fish curry");
				break;
				default:
				
					System.out.println("invalid");
				

          }
		}
}
}