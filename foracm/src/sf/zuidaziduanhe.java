package sf;

public class zuidaziduanhe
{

	public static void main(String[] args)
	{
		
	}
	public static void mostfast()
	{
		int [] a={-2,11,-4,13,-5,2};
		int max=-9999;
		int start=0,end=0;
		int sum=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.print("第"+i+"轮 sum");
			if(max<sum)
			{
				max=sum;
				start=index;
				end=i;
				System.out.print("max="+max+" 开始："+start+" 结束："+end);
			}
			if(sum<0)
			{
				System.out.println("发现sum<0 sum=0,index="+(i+i));
				sum=0;
				index=i+1;
			}
			System.out.println();
		}
		System.out.println("sum="+max+" start+"+start+" end="+end);
	}
}
