package zmeoj;

import java.util.Arrays;
import java.util.Scanner;

public class ËÄÔòÔËËã
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String input=s.next();
			input=input.substring(0, input.length()-1);
			if(input.contains("+"))
			{
				String[] arr=input.split("\\+");
//				System.out.println(Arrays.toString(arr));
				System.out.println(Integer.valueOf(arr[0])+Integer.valueOf(arr[1]));
			}else if(input.contains("-"))
			{
				String[] arr=input.split("-");
				System.out.println(Integer.valueOf(arr[0])-Integer.valueOf(arr[1]));
			}else if(input.contains("*"))
			{
				String[] arr=input.split("\\*");
//				System.out.println(Arrays.toString(arr));
				System.out.println(Integer.valueOf(arr[0])*Integer.valueOf(arr[1]));
			}else if(input.contains("/"))
			{
				String[] arr=input.split("/");
				System.out.println(Integer.valueOf(arr[0])/Integer.valueOf(arr[1]));
			}
		}
	}

}
