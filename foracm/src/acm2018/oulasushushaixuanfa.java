package acm2018;

public class oulasushushaixuanfa 
{

	public static void main(String[] args) 
	{
		
		final int MAX=100;
		int[] prime=new int[MAX];
		boolean[] isp=new boolean[MAX];
		int count=0;
		Long start=System.currentTimeMillis();
		for(int i=2;i<MAX;i++)
		{
			if(isp[i]==false)
			{
				prime[count]=i;
				count++;
			}
			
			for(int j=0;j<count&& i*prime[j]<MAX;j++)
			{
				isp[i*prime[j]]=true;
				if(i%prime[j]==0)
				{
					break;
				}
			}
		}
		int r=0;
		int qwe=0;
		for(int i=0;i<prime.length;i++)
		{
			if(prime[i]!=0)
			{
				if(judge(prime[i]))
				{
					System.out.print(prime[i]+",");
					qwe++;
				}
				r++;
			}else
			{
				break;
			}
		}
//		System.err.println(qwe);
		Long over=System.currentTimeMillis();
//		System.err.println((over-start)+"ms");
	}
	public static boolean  judge(int a)
	{
		StringBuffer q=new StringBuffer(String.valueOf(a));
		StringBuffer w=new StringBuffer(q);
		if(q.reverse().toString().equals(w.toString()))
		{
			return true;
		}
		return false;
	}

}
