class int_con
{
	public static void main(String[]args)
	{
		//int a=1;
		//short b=a;
		//System.out.println(b); lossy conversion from int to short
		int c=1;
		int d=c;
		System.out.println(d);
		int e=1;
		long f=e;
		System.out.println(f);
		//int g=1;
		//char h=g;
		//System.out.println(g);  lossy conversion from byte to char
		int i=1;
		float j=i;
		System.out.println(j);
		int k=1;
		double l=k;
		System.out.println(l);
		
	}
}