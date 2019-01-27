package javaclass;

import java.util.Scanner;

public class j1117
{

	public static void main(String[] args)
	{
		System.out.println("请输入路程");
		Scanner s=new Scanner (System.in);
		while(s.hasNextDouble())
		{
			double a=s.nextDouble();
			if(a<0)
			{
				System.out.println("别逗我，你背着车走了？");
			}
			else if(a==0)
			{
				System.out.println("要付："+"0"+"元");
			}else if(a<=2&&a>0)
			{
				System.out.println("要付："+"6"+"元");
			}
			else
			{
				System.out.println("要付"+String.format("%.2f",(6+(a-2)*5))+"元");
			}
			
		}
	}

}
