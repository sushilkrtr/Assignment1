import java.util.Scanner;

public class Swap {

	int x;int y;int z;
	
	public void swapit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit x to be swaped");
		x=sc.nextInt();
		System.out.println("Enter the digit y to be swaped");
		y=sc.nextInt();
		z=x;
		x=y;
		y=z;
		System.out.println("x="+x+"y="+y);
		
		
	}
	public static void main(String[] args) {
		Swap s=new Swap();
		s.swapit();
		
	}
}
