import java.util.Scanner;


public class hdu2025
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String chushi=s.nextLine();
			char[] arr;
			arr=new char[chushi.length()];
			int d=0;
			for(int a=0;a<chushi.length();a++)
			{
				arr[a]=chushi.charAt(a);
				int b=(int)arr[a];
				if(b>=d)
				{
					d=b;
				}
			}
			
			for(int a=0;a<chushi.length();a++)
			{
				
				int b=(int)arr[a];
					System.out.print(arr[a]);
					if(b==d)
					{
						System.out.print("(max)");
					}
			}
			/*if((int)arr[chushi.length()-1]==d)
			{
				System.out.println("(max)");
			}else
			{*/
				System.out.println();
			//}
		}

	}

}
