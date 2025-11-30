import java.util.Scanner;
class tip
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bill : ");
		float bill=sc.nextFloat();
		System.out.print("Tip rate : ");
		float tip=sc.nextFloat();
		float amount=(tip*bill)/100;
		float totalbill=bill+amount;
		System.out.println("tottalbill is : "+totalbill);
		System.out.println("tip added is : "+amount);
	}
}