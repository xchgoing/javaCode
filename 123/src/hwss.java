
public class hwss
{

	public static void main(String[] args)
	{
		int count=0;
		for(int i=2;i<=100000;i++)
		{
			if(isprimenumber(i)&&ishuiwen(i))
			{
				count++;
				System.out.println(i);
			}
		}
         System.out.println("�ܹ�"+count+"��");
	}
	private static long currenTimeMillis()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	public static boolean isprimenumber(int i)//�Ƿ�������
	{
		int j=2;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		return j>i/2?true:false;
	}
	public static boolean ishuiwen(int i)
	{
		StringBuffer hw=new StringBuffer(String.valueOf(i));
		if(String.valueOf(i).equals(hw.reverse().toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
