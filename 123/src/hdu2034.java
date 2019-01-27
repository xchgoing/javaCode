import java.util.Arrays;
import java.util.Scanner;


public class hdu2034
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int m=s.nextInt();
			int count=0;
			if(m==0&&n==0)
			{
				break;
			}
			int arrn[][]=new int[2][n];
			int arrm[][]=new int[2][m];
			for(int a=0;a<n;a++)
			{
				arrn[0][a]=s.nextInt();
			}
			for(int a=0;a<m;a++)
			{
				arrm[0][a]=s.nextInt();
				for(int b=0;b<n;b++)
				{
					if(arrm[0][a]==arrn[0][b])
					{
						arrm[1][a]=1;
						arrn[1][b]=1;
						count++;
						continue;
						
					}
				}
			}
			int arrs[]=new int[n-count];
			if(count==n)System.out.println("NULL");
			else
			{
				for(int a=0;a<n-count;a++)
				{
					for(int b=0;b<n;b++)
					{
						if(arrn[1][b]!=1)
						{
							arrs[a]=arrn[0][b];
							arrn[1][b]=1;
							break;
						}
					}
				}
				Arrays.sort(arrs);
				for(int x:arrs)
				{
					System.out.print(x+" ");
				}
				System.out.println();
			}
			/*for(int x=0;x<arrs.length;x++)
			{
				if(x<arrs.length-1)
				{
					System.out.print(arrs[x]+" ");
				}
				else
				{
					System.out.println(arrs[x]);
				}
			}*/
			
				
		}

	}

}
