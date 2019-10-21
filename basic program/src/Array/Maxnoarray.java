package Array;

import java.util.Scanner;

public class Maxnoarray 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		//int b=s.nextInt();
		int size=s.nextInt();
		int[]values=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
			values[i]=s.nextInt();
			int max=0;
			for(int i=0;i<size;i++)
			{
				if(values[i]>max)
				{
					max=values[i];
				}
			}
			System.out.println(max);
		}
	}