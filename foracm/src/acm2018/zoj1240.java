package acm2018;

import java.util.Scanner;

public class zoj1240
{
	public static void main(String[] args)
	{
		String[] arr={"B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A"};
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				String q=s.next();
				System.out.println("String #"+(a+1));
				for(int i=0;i<q.length();i++)
				{
					System.out.print(arr[(int)q.charAt(i)-(int)'A']);
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
