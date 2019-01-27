package sf;

import java.util.Arrays;
import java.util.Scanner;



public class text
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String temp=s.next();
			char[] arr=new char[3];
			for(int a=0;a<3;a++)
			{
				arr[a]=temp.charAt(a);
			}
			Arrays.sort(arr);
			for(int a=0;a<3;a++)
			{
				System.out.print(arr[a]);
				if(a<2)
				{
					System.out.print(" ");
				}else
				{
					System.out.println();
				}
			}
		}
	}

}
