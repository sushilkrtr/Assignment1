import java.util.Scanner;

public class Prime {
	
	int x;
	int count=0;
	
	public void primecal()
	{
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		for(int i=2;i<x-1;i++)
		{
			
		if(x%i==0)
		{
			count++;	
		}
		}
		
		if(count>0)
		{
			System.out.println("Not a prime number");
		}
	    

	}
	public static void main(String[] args) {
		
		Prime z=new Prime();
		z.primecal();
		
	}
}
