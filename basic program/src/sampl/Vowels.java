package sampl;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		String a[]=new String[n];
		char f=0;
		for(int i=0;i<n;i++)
		{
			
			a[i]=s.next();
		}
		
		for(int i=0;i<n;i++)
		{
			
			f=a[i].charAt(0);
		
		if(f=='a'||f=='A'||f=='e'||f=='E'||f=='i'||f=='I'||f=='o'||f=='O'||f=='u'||f=='U')
{
			System.out.println(a[i]);
}
		}
		
	}

}
