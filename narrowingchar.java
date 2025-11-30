class narrowingchar
{
	public static void main(String[]args)
	{
		char a=1;
		short i=(short) a;
		System.out.println(i);
		byte f=(byte) a;
		System.out.println(f);
	}
}