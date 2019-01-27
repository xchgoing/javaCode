import java.util.Scanner;


public class zoj2851
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				int countt=0;
				int countk=0;
				while(true)
				{
					String temp=s.nextLine();
					if(temp.equals("##"))
					{
						break;
					}
					boolean other=true;
					for(int a=temp.length()-1;a>=0;a--)
					{
						String q=temp.substring(a, a+1);
						if(other&&q.equals(" "))
						{
							countk++;
						}else if(q.equals("	"))
						{
							countt++;
							other=false;
						}else
						{
							other=false;
						}
					}
				}
				System.out.println(String.format("%d tab(s) replaced",countt));
				System.out.println(String.format("%d trailing space(s) removed", countk));
//				System.out.println(countt+" "+countk);
			}
		}
		
	}

}
