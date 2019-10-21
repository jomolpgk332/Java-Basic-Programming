package Array;

import java.util.Scanner;

public class Arraysize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		//int b=s.nextInt();
		int size=s.nextInt();
		int[]values=new int[size];
		int sum=0;
		int sum1=0;
		int b=0;
		int c=0;
	
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the first array");
			values[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(values[i]%2==0)
			{
				System.out.println(values[i]);
				sum=sum+values[i];
						b++;
			}
			else
			{
				
				System.out.println(values[i]);
				sum1=sum1+values[i];
				c++;
			}
		}
			   int e=sum/b;
			   int o=sum1/c;
			System.out.println(e);
			System.out.println(o);
		}
	}

