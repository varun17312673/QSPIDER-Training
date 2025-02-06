import java.util.Scanner;
class clesius
{
	public static void main(String[]args)
	{
		Scanner q=new Scanner(System.in);
		{
			System.out.print("Enter degree celsius:");
			double celsius=q.nextDouble();
			double Fahrenheit=(9.0/5)*celsius+32;
			System.out.print("Degree in Celsius: "+Fahrenheit);
		}
	}
	
}