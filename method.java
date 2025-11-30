import java.util.Scanner;
class method
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int a = new Scanner(System.in).nextInt();	
		System.out.println(factorial(a));
	    System.out.println(fibonacci(a));
	    System.out.println(prime(a));	
	}
	public static int factorial(int a) 
	{
		int b=1;
		for(int i=a;i>1;i--)
			b=i*b;
		return b;
	}
	public static int fibonacci(int a)
	{
		int b=0;
		int c=1;
		System.out.println(b+" ");
		System.out.println(c+" ");
		for (int i=0;i<=a ;i++ ) 
		{
			int d=b+c;
			b=c;
			c=d;
		
		}
		return c;
	}
	public static int prime(int a)
	{
		boolean flag=true;
		for (int i=2;i<a ;i++ ) 
		{
		 	if(a%i==0)
		 		flag=false;
		}
		if (flag) 
			System.out.println(a+" is a prime number");
		else
			System.out.println(a+" is not a prime number"); 
	return a;
	}
	
}