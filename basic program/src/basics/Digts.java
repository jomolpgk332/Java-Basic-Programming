package basics;

import java.util.Scanner;

public class Digts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float n= s.nextFloat();
		s.nextLine();
		System.out.printf(" %.3f\n",n);
		int d= s.nextInt();
		System.out.printf(" %03f\n",d);

	}

}
