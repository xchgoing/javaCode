import java.util.Scanner;


public class hdu2024
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String q=s.nextLine();
			int a=Integer.parseInt(q);
			//System.out.println("ok");
			for(int b=0;b<a;b++)
			{
				String shuru=s.nextLine();
				bz(shuru);
				
			}
			
		}

	}
	public static void bz(String shuru)
	{
		int[] arr;
		arr=new int[shuru.length()];
		for(int a=0;a<shuru.length();a++)
		{
			char ls=shuru.substring(a, a+1).charAt(0);
			arr[a]=(int)ls;
		}
		if((arr[0]<=90&&arr[0]>=65)||(arr[0]<=122&&arr[0]>=97||arr[0]==95))
		{
			int count=0;
			for(int b=1;b<shuru.length();b++)
			{
				if((arr[b]<=90&&arr[b]>=65)||(arr[b]<=122&&arr[b]>=97||arr[b]==95)||(arr[b]<=57&&arr[b]>=48))
				{
					count++;
				}
			}
			if(count==shuru.length()-1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
	}

}
