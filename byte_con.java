class byte_con
{
	public static void main(String[]args)
	{
		byte a=1;
		short b=a;
		System.out.println(b);
		byte c=1;
		int d=c;
		System.out.println(d);
		byte e=1;
		long f=e;
		System.out.println(f);
		//byte g=1;
		//char h=g;
		//System.out.println(g);  lossy conversion from byte to char
		byte i=1;
		float j=i;
		System.out.println(j);
		byte k=1;
		double l=k;
		System.out.println(l);
		
	}
}