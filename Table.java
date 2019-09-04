import java.util.Scanner;

public class Table {
	int x;
	public void tab()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for its table");
		x=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int prod=x*i;
			System.out.println(+x+" * "+i+"="+prod);
		}
		
		
	}

	public static void main(String[] args) {
		Table t=new Table();
		t.tab();
	}
}
