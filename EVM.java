import java.util.Scanner;
class EVM
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,ss=0,aap=0,mns=0,nota=0;
		System.out.println();
		System.out.println("     Welcom     ");
		System.out.println();
		System.out.println("Enter the Population : ");
		int population=sc.nextInt();
		for(int i=1;i<=population;i++)
		{
			System.out.println();
			System.out.println(***LIST OF PARTIES***);
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.println("Enter the option : ");
			int opt=sc.nextInt();
			if(opt>=1&&opt<=6)
				if(opt==1)
				{
					bjp++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==1)
				{
					cng++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==1)
				{
					ss++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==1)
				{
					aap++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==1)
				{
					mns++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==1)
				{
					nota++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt>=1&&opt<=6)
				{
					i--;
					System.out.println("INVALID OPTION");
				}
				
		}
		if (bjp>=cng&&bjp>=ss&&bjp>=aap&&bjp>=mns&&bjp>=nota)
		{
			System.out.println("BJP HAS WON THE ELECTION BY"+bjp+"votes");
		}
		if (cng>=bjp&&cng>=ss&&cng>=aap&&cng>=mns&&cng>=nota)
		{
			System.out.println("CNG HAS WON THE ELECTION BY"+cng+"votes");
		}
		if (ss>=cng&&ss>=bjp&&ss>=aap&&ss>=mns&&ss>=nota)
		{
			System.out.println("SS HAS WON THE ELECTION BY"+ss+"votes");
		}
		if (app>=cng&&aap>=ss&&aap>=bjp&&aap>=mns&&aap>=nota)
		{
			System.out.println("AAP HAS WON THE ELECTION BY"+aap+"votes");
		}
		if (mns>=cng&&mns>=ss&&mns>=aap&&mns>=bjp&&mns>=nota)
		{
			System.out.println("MNS HAS WON THE ELECTION BY"+mns+"votes");
		}
		if (nota>=cng&&nota>=ss&&nota>=aap&&b
jp>=mns&&bjp>=nota)
		{
			System.out.println("BJP HAS WON THE ELECTION BY"+bjp+"votes");
		}
	}
}