import java.util.Scanner;
class evenloop
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the range : ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
