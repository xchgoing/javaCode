package hanjijichuti;

import java.util.Arrays;
import java.util.Scanner;

public class hud1029
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			int[] arr=new int[q];
			for(int a=0;a<q;a++)
			{
				arr[a]=s.nextInt();
			}
			Arrays.sort(arr);
			int count=1;
			for(int a=1;a<q;a++)
			{
				if(arr[a]==arr[a-1])count++;
				else count=1;
				if(count==(q+1)/2)System.out.println(arr[a]);
			}
		}
	}
}
