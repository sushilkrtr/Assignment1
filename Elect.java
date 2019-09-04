import java.util.Scanner;

public class Elect {

	int unit;
	double chg=0;
	public void calElec()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of unit");
	  unit=sc.nextInt();
	  if(unit<=100)
	  {
		   chg=(unit*1.20);
		  System.out.println(+chg+"is the total amount to be paid");
	  }
	  else if(unit>100 && unit<=300)
	  {
		 chg=(120+(unit-100)*2.00); 
		System.out.println(+chg+"is the total amount to be paid");
	  }
	  else if(unit>300 && unit<=600)
	  {
		   chg=(120+400+(unit-300)*3.00);
		  System.out.println(+chg+"is the total amount to be paid");
	  }
	  else
	  {
		   chg=(120+400+900+(unit-600)*5.00);
		  System.out.println(+chg+"is the total amount to be paid");
	  }
	  
	 // System.out.println(+chg+"is the total amount to be paid");
	}
	public static void main(String[] args) {
		
		Elect e=new Elect();
		e.calElec();
	}
}
