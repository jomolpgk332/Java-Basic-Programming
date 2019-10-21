package controlstructures;
import java.util.Scanner;
public class Amstrong {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=a;
		int c=a;
		int r;
		double sum=0;
		int count=0;
		while(c!=0)
		{count++;
		c=c/10;
		}
		while(a!=0)
		{
			r=a%10;
			sum=sum+Math.pow(r, count);
			a=a/10;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
		

}
}