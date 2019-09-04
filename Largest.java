import java.util.Scanner;

public class Largest {
      int x,y,z;
	public void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of three digits to be compared");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y && x>z)
		{
			System.out.println(x+" is greatest among all");
		}
		else
		{
			if(y>z && y>x)
			{
			System.out.println(y+"is greatest among all");	
			}
			else
			{
				System.out.println(z+" is greatest among all");
			}
		}
		
	}
	public static void main(String[] args) {
		Largest l=new Largest();
		l.calc();
	}
}
