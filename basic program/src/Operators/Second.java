package Operators;
import java.util.*;
public class Second {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int n=s.nextInt();
	 
	 int b=n%10;
	 int c=b*b;
	 int d=n/100;
	 int e=d*b;
	 int m=c*e;
	 System.out.println(c+""+b);
	 

	}

}
