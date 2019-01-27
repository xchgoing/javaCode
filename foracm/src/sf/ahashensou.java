package sf;

import java.util.Scanner;

public class ahashensou
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			
		}
	}
	
	public static  void dfs(int step)
	{
		int count=0;//表示正确答案的个数
		int p=10;//表示可能性的个数
		int n=100;//n表示总长度
		int[] box=new int[n];//用来模拟盒子的个数
		int[] book=new int[p];//用来模拟可能性的个数
		if(step==n)//已经在第n个盒子边上了，表示结束
		{
//			if(判别式判断是不是正确答案)
//			{
//				若是返回之前一步最近调用的地方；
//			    count++;return;
//			}
			for(int a=0;a<p;a++)//遍历可能性找出没有用过的那个
			{
				if(book[a]==0)//book[a]==0表示这个可能性没被使用过
				{
					box[step]=a;//把第a种可能性放到第step个盒子中
					book[a]=1;//标记可能性表示已经用过了
					
					dfs(step+1);//开始下一个盒子可能性的假设
					book[a]=0;//开始往回调整要将此次用过的可能性回归到未使用的状态
				}
			}
			return;//结束
		}
	}
}
