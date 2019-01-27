import java.util.Arrays;
import java.util.Scanner;

public class Main {                                   //ps：相同的思路用类处理会超时

public static void main(String[] args) 
{
	Scanner in=new Scanner(System.in);
	int n,m,count=0,a,b;
	while(in.hasNextInt())
	{
		count++;                                     //输出格式
		if(count>1)System.out.println();
		System.out.printf("Case %d:\n",count);
		
		
		n=in.nextInt();                              //数据读入             
		m=in.nextInt();
		
		
		int[] num=new int[n+1];//存父节点                      //开数组
		int[] cc=new int[n+1];//存人数
		
		for(int i=1;i<=n;i++)                      //赋值，节点数组存自己，人数数组为1                 
		{
			num[i]=i;
			cc[i]=1;
		}
		
		
		while(m-->0)                                //开始判断
		{
			String s=in.next();
			if(s.equals("M"))                        //如果是M
			{
				a=in.nextInt();                     //读入
				b=in.nextInt();
				
				int temp1=a,temp2=b;                //找节点
				while(num[temp1]!=temp1)
				temp1=num[temp1];
				while(num[temp2]!=temp2)
				temp2=num[temp2];
				
				if(temp1!=temp2)                   //人数相加
				{
					cc[temp1]+=cc[temp2];
					int temp;
					while(temp1!=num[b])
					{
						temp=num[b];
						num[b]=temp1;
						b=temp;
					}
				}
			}
			else if(s.equals("Q"))               //输出
			{
				a=in.nextInt();
				while(a!=num[a])
				a=num[a];
				System.out.println(cc[a]);
			}
		}
	}
}

}