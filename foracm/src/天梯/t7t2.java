package ÌìÌİ;

import java.util.Arrays;
import java.util.Scanner;

public class t7t2
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[3];
		while(s.hasNextInt())
		{
			for(int a=0;a<3;a++)
			{
				arr[a]=s.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0]+"->"+arr[1]+"->"+arr[2]);
		}
	}

}
