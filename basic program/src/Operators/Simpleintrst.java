package Operators;
import java.util.*;
public class Simpleintrst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rate:");
		int p=s.nextInt();
		System.out.println("Enter the no of years:");
		int n=s.nextInt();
		System.out.println("Enter the rate of intrest:");
		float r=s.nextFloat();
		float i=p*n*r/100;
		System.out.printf("%.2f",i);
		
		
		

	}

}
