package ÌìÌÝ;

import java.util.Scanner;

public abstract class LiL028t
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		String o="Yes";

			while(n-->0)
			{
				int m=s.nextInt();
				if(m==1){
					System.out.println("No");
					continue;
				}
				for(int a=2;a<=Math.sqrt(m);a++)
				{
					if(m%a==0){
						o="NO";
						break;	
					}
				}
				System.out.println(o);

		} 

	}

}
