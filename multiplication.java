import java.util.*;
class multiplication
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter number1:");
			byte n1=sc.nextByte();
			System.out.print("Enter number2:");
			byte n2=sc.nextByte();
			int ans=n1*n2;
			System.out.println("multiplication Byte:"+ans);
			
		}
		{
			System.out.print("Enter number1:");
			int n1=sc.nextInt();
			System.out.print("Enter number2:");
			int n2=sc.nextInt();
			int ans=n1*n2;
			System.out.println("multiplication Int:"+ans);
			
		}
		{
			
			System.out.print("Enter number1:");
			short n1=sc.nextShort();
			System.out.print("Enter number2:");
			short n2=sc.nextShort();
			int ans=n1*n2;
			System.out.println("multiplication Short:"+ans);
			
		}
		{
			System.out.print("Enter number1:");
			long n1=sc.nextLong();
			System.out.print("Enter number2:");
			long n2=sc.nextLong();
			long ans=n1*n2;
			System.out.println("multiplication Long:"+ans);
			
				
		}
		{
			System.out.print("Enter number1:");
			float n1=sc.nextFloat();
			System.out.print("Enter number2:");
			float n2=sc.nextFloat();
			float ans=n1*n2;
			System.out.println("multiplication Float:"+ans);
			
		}
		{
			System.out.print("Enter number1:");
			double n1=sc.nextDouble();
			System.out.print("Enter number2:");
			double n2=sc.nextDouble();
			double ans=n1*n2;
			System.out.println("multiplication Double:"+ans);
			
		}
		{
			System.out.print("Enter char1:");
			char n1=sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Enter char2:");
			char n2=sc.next().charAt(0);
			int ans=n1*n2;
			System.out.println("multiplication Char:"+ans);
		}
	}
}
