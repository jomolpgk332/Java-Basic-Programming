package controlstructures;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int c=0;
		int b=1;
		System.out.printf("%d %d ",c,b);
		for(int i=0;i<n-2;i++) {
			int a=c+b;
			System.out.printf("%d ",a);
			c=b;
			b=a;
			
		}

	}

}
