package zuoye;

import java.util.Scanner;

public class paix
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int[] arr=new int[10];
			for(int a=0;a<9;a++)
			{
				if(arr[a]%10>arr[a+1]%10)
				{
					int temp=arr[a];
					arr[a]=arr[a+1];
					arr[a+1]=temp;
				}
			}
		}
	}

}
