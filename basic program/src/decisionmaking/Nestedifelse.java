package decisionmaking;

import java.util.Scanner;

public class Nestedifelse
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your laptop:");
		String hp=s.nextLine();
		System.out.println("Choose your laptop ram size:");
		int ram=s.nextInt();
		System.out.println("Choose your laptop hard disk size:");
		int hdd=s.nextInt();
		if(hp.equals("hp")) {
			if(16==ram) {
				if(27==hdd) {
					System.out.println("Successfully purcahsed");
				}
				else {
					System.out.println("no hdd:");
					}
				{
					System.out.println("not ram:");

				}
				 
					
					
		}
			
	}
		System.out.println("no hp:");
}
}
