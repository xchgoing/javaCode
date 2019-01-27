import java.util.Scanner;


public class hdu2043
{

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			String mm;
			n=s.nextInt();
			s.nextLine();
			for(int a=0;a<n;a++)
			{
				mm=s.nextLine();
				int az=0,bc=0,sz=0,fh=0;
				if(mm.length()>16||mm.length()<8)
				{
					System.out.println("NO");continue;
				}
				else for(int b=0;b<mm.length();b++)
				{
					char q=mm.charAt(b);
					int w=(int)q;
					if(bc!=1&&w>=65&&w<=90)bc++;
					else if(az!=1&&w>=97&&w<=122)az++;
					else if(sz!=1&&w>=48&&w<=57)sz++;
					else if(fh!=1&&(w==126||w==33||w==64||w==35||w==36||w==37||w==94))fh++;
				}
			    //System.out.print(az+" "+bc+" "+fh+" "+sz);
				if(az+bc+sz+fh>=3)System.out.println("YES");
				else System.out.println("NO");
			}
		}

	}

}
