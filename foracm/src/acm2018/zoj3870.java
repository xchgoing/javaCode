package acm2018;

import java.util.Scanner;

public class zoj3870
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				String[] arr=new String[m];
				for(int b=0;b<m;b++)
				{
					arr[b]=Integer.toString(s.nextInt(),2);
				}
				int count=0;
				for(int b=0;b<m;b++)
				{
					for(int c=b+1;c<m;c++)
					{
						if(arr[b].length()==arr[c].length())
						{
							continue;
						}else
						{
							String max=arr[b];
							String min=arr[c];
							if(arr[c].length()>arr[b].length())
							{
								max=arr[c];
								min=arr[b];
							}
							char temp=max.charAt(max.length()-min.length());
							if(temp=='0')
							{
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}
