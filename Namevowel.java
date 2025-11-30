import java.util.Scanner;
class Namevowel
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String un =sc.next().toUpperCase();
		int len= un.length();
		for(char i=1;i<=len-1;i++)
		{
			char v=un.charAt(i);
			if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
			{
				System.out.println(v);
			}
		}
			
	}
}
