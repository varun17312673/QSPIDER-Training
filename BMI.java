import java.util.Scanner;
class BMI
{
	public static void main(String[]args)
	{
		System.out.print("Enter weight in pound : ");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		num1=num1*0.454;
		
		System.out.print("Enter weight in inches : ");
		Scanner sc=new Scanner(System.in);
		double num2=sc.nextDouble();
		num2=num2*0.0254;
		
		float bmi=num1/num2*num2;
		System.out.println("BMI is : "+bmi);
	
		
		
	}
}