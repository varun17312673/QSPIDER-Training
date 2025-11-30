class min
{
	public static void main(String[]args)
	{
		int num = 49498465;
		int min=9;
		for(int i=num;i>0;i/=10)
		{
			int dgt=i%10;
			if(min>dgt)
				min=dgt;
		}
		System.out.println("largest dgt from "+ num + " is " +min);
	}
}