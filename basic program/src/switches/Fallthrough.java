package switches;
import java.util.Scanner;
public class Fallthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
			System.out.println("31 days:");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		case 12:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 or 29 days");
			break;
			default:
				System.out.println("Invalid");
		}
	}

}
