import java.util.Scanner;
class IncomeTaxCalculator
{
	public static void main(String args[])
	{
	double tax=0,it;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the taxable income: ");
	it=in.nextDouble();
	if(it<=20000)
		tax=0;
	else if(it<=40000)
		tax=0.1*(it-20000);
	else if(it<=60000)
		tax=(0.2*(it-40000))+(0.1*20000);
	else if(it>60000)
		tax=(0.3*(it-60000))+(0.2*20000)+(0.1*20000);
	
	System.out.println("The income tax payable is: "+tax);
    in.close();
	}
}