import java.util.Scanner;
public class hdu2022
{
    public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int m,n;
		while(s.hasNext());
		{
			m=s.nextInt();
			n=s.nextInt();
			int arr[][];
			arr=new int[m][n];
			int h=0,l=0;
			for(int a=0;a<m;a++)
			{
				int max=0;
				for(int b=0;b<n;b++)
				{
					arr[a][b]=s.nextInt();
					if(Math.abs(arr[a][b])>max)
					{
						max=Math.abs(arr[a][b]);
						h=a;
						l=b;
					}
				}
			}
			System.out.println((h+1)+" "+(l+1)+" "+arr[h][l]);
			
		}

	}

}
