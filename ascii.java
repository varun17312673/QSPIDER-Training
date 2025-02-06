import java.util.Scanner;
class ascii
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter character : ");
		char ch=sc.next().charAt(0);
		String op=((ch>='A'&&ch<='Z')||(ch>='a'&&ch<=122))?((ch>='a'&&ch<='z')?(ch+"Lowercase"):(ch+"Uppercase")):((ch>='0'&&ch<='9')?(ch+"is digit"):(ch+"is special"));
		System.out.println(op);
		
	}
}