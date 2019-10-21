package Array;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;

public class arrayadd 
{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("Enter the index");
//int b=s.nextInt();
int size=s.nextInt();
int[]values=new int[size];
int[]value=new int[size];
for(int i=0;i<size;i++)
{
	System.out.println("Enter the first array");
	values[i]=s.nextInt();
}
for(int i=0;i<size;i++)
{
	System.out.println("Enter the second array");
	value[i]=s.nextInt();
}
for(int i=0;i<size;i++)
{
	System.out.println(values[i]+value[i]);
	
}


}
}
