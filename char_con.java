class char_con
{
	public static void main(String[]args)
	{
		//char a=1;
		//short b=a;
		//System.out.println(b); lossy conversion from char to short
		char c=1;
		int d=c;
		System.out.println(d); 
		char e=1;
		long f=e;
		System.out.println(f);
		char g=1;
		char h=g;
		System.out.println(g); 
		char i=1;
		float j=i;
		System.out.println(j);
		char k=1;
		double l=k;
		System.out.println(l);
		
	}
}