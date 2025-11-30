class float_con
{
	public static void main(String[]args)
	{
		float a=1;
		short b=a;
		System.out.println(b); lossy conversion from float to short
		float c=1;
		int d=c;
		System.out.println(d); lossy conversion from float to int
		float e=1;
		long f=e;
		System.out.println(f); lossy conversion from float to long
		float g=1;
		char h=g;
		System.out.println(g); lossy conversion from float to char
		float i=1;
		float j=i;
		System.out.println(j);
		float k=1;
		double l=k;
		System.out.println(l);
		
	}
}