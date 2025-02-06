import java.util.Scanner;
class cylinder
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		{
		System.out.print("Enter radius:");
		double radius=sc.nextDouble();
		System.out.print("Enter height:");
		double height=sc.nextDouble();
		final double pi=22.0/7;
		double area=pi*radius*radius;
		System.out.println("Area of a cylinder="+area);

		double volume=area*height;
		System.out.println("Perimeter of a cyclinder="+volume);
		}
	}
}