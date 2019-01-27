package acm2018;

import java.math.BigInteger;
import java.util.Scanner;

public class acm1021
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			if(q<2)
			{
				System.out.println("no");
			}else
			{
				String[] arr={"no","no","yes","no"};
				System.out.println(arr[q%4]);
			}
		}
	}

}
