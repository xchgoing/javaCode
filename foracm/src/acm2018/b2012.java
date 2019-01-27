package acm2018;

import java.util.Scanner;
public class b2012
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextDouble())
		{
			double n=s.nextDouble();
			for(int a=0;a<n;a++)
			{
				double q=s.nextDouble();
				double w=s.nextDouble();
				double end=w*2/5;            //计算等候费，因为前一次的起步价加上燃油费等于后一次的起步价所以不做计算
				double end2=w*2.5/4;
				if(q>3)                      //计算路程费
				{
					if(q<=10)
					{
						end+=2*(q-3);
						end2+=2.5*(q-3);
					}
					else
					{
						end+=14+3*(q-10);
						end2+=17.5+3.75*(q-10);
					}
				}
				end=(int)(end+0.5);          //四舍五入
				end2=(int)(end2+0.5);
				System.out.println((int)(end2-end));//相减并输出
			}
		}
	}
}