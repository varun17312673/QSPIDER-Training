class evenoddproduct
{
	public static void main(String[]args)
	{
		int num=1234;
		int even=1;
		int odd=1;
		int temp=0;
		int rem=num%10;
		temp=(rem%2==0)?(even=even*rem):(odd=odd*rem);
		
		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(even=even*rem):(odd=odd*rem);
	
		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(even=even*rem):(odd=odd*rem);
	
		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(even=even*rem):(odd=odd*rem);

		System.out.println("even product : "+even);
		System.out.println("odd product : "+odd);
	}
}