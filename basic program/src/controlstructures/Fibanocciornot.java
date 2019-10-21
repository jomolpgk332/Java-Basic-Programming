package controlstructures;
import java.util.Scanner;
public class Fibanocciornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int c=0;
		int b=1;
		int d=0;
		//System.out.printf("%d %d ",c,b);
		for(int i=0;i<n;i++)
		{
			int a=c+b;
			if(a==n)
			{
				d++;
			}
			c=b;
			b=a;
			
			
		}
		if(d!=0)
		{
			System.out.printf("Fibanocci number ");
		}
		else {
			System.out.printf("Not a fibanocci number ");
		}
		
	}

}
