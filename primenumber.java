import java.util.Scanner;
class primenumber
{
	public static void main(String[]args)
	{
		System.out.print("Enter number : ");
		int num =sc.nextInt();
	
		System.out.println((num==2||num==3)?(num+"is prime"):((num%2==0||num%3)?(num+"is not Prime):(num="is prime)));
	}
}