class mobiledriver
{
	public static void main(String[] args) 
	{
		mobile m1=new mobile();
		m1.brand="Apple";
		m1.model="iphone 13";
		m1.ram=16;
		m1.rom=128;
		m1.cam=2;
		m1.price=65000;

		System.out.println(m1);
		System.out.println("Brand "+m1.brand);
		System.out.println("model "+m1.model);
		System.out.println("RAM "+m1.ram);
		System.out.println("ROM "+m1.rom);
		System.out.println("Number of Camera "+m1.cam);
		System.out.println("PRICE "+m1.price);
		System.out.println("--------------------------");

		mobile m2=new mobile();
		m2.brand="samsung";
		m2.model="s24";
		m2.ram=16;
		m2.rom=128;
		m2.cam=5;
		m2.price=50000;

		System.out.println(m2);
		System.out.println("Brand "+m2.brand);
		System.out.println("model "+m2.model);
		System.out.println("RAM "+m2.ram);
		System.out.println("ROM "+m2.rom);
		System.out.println("Number of Camera "+m2.cam);
		System.out.println("PRICE "+m2.price);
		System.out.println("--------------------------");

		mobile m3=new mobile();
		m3.brand="poco";
		m3.model="poco 69";
		m3.ram=4;
		m3.rom=64;
		m3.cam=8;
		m3.price=10000;

		System.out.println(m3);
		System.out.println("Brand "+m3.brand);
		System.out.println("model "+m3.model);
		System.out.println("RAM "+m3.ram);
		System.out.println("ROM "+m3.rom);
		System.out.println("Number of Camera "+m3.cam);
		System.out.println("PRICE "+m3.price);
		System.out.println("--------------------------");
	}
}