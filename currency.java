import java.util.Scanner;
class currency
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.print();
		System.out.println("***  CURRENCY CONVERTOR   ***");
		System.out.println();
		System.out.println("Enter the amount(INR) : ");
		float inr=sc.nextFloat();
		System.out.println();
		System.out.println("LIST OF CURRENCY");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GDP");
		System.out.println("4. PKR");
		System.out.println();
		System.out.println("ENTER THE CURRENCY : ");
		String curr=sc.next().toUpperCase();
		float concurr=0;
		if(curr.equals("USD"))
		{
			concurr=inr/86.56f;
			System.out.println(inr+" INR =" +concurr+ "USD");
		}
		else if(curr.equals("EUR"))
		{
			concurr=inr/90.25f;
			System.out.println(inr+" INR " +concurr+ "EUR");
		}

				
	}
}