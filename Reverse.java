import java.util.Scanner;

public class Reverse {
	int x;
	int y;
	int rev=0;
	public void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		x=sc.nextInt();
		while(x>0)
		{
		y=x%10;
		rev=rev*10+y;
		x=x/10;
		}
		System.out.println(+rev);
	}
	
	
	public static void main(String[] args) {
	
		Reverse z=new Reverse();
		z.calc();
		
		
	}

}
