import java.util.Scanner;


public class hdu2030
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String cishi=s.nextLine();
			int n=Integer.parseInt(cishi);
			for(int a=0;a<n;a++)
			{
				int count=0;
				String shuru=s.nextLine();
				char[] arr;
				arr=new char[shuru.length()];
				for(int b=0;b<shuru.length();b++)
				{
					arr[b]=shuru.substring(b, b+1).charAt(0);
					//System.out.println((int)arr[b]);
					if((int)arr[b]>127)
					{
						count++;
					}
				}
				System.out.println(count);
			}
		}

	}

}
