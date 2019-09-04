import java.util.Scanner;

public class Sum {
	double a,b;
	public double sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the variable values/n");
		a=sc.nextDouble();
		b=sc.nextDouble();
		double sum=a+b;
		return sum;
	}
public static void main(String[] args) {
	Sum z=new Sum();
	double x=z.sum();
	System.out.println(x);
	
}
}
