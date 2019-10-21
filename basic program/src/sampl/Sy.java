import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      int e=0;
      int p=0;
     for(int i=0;i<n;i++)
      {
       int c=s.nextInt();
        if(c>=0)
        {
        e++
      }
        else 
        {
          p++;
        }
      }
        System.out.println("Number of positive numbers is " +e+ " and the negetive numbers is"+p);
    
}
}