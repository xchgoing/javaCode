package zuoye;
import java.util.Date;
import java.util.Scanner;

public class ZYE14
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			Date date=new Date(); 
			int year=date.getYear()+1900;
			int month =date.getMonth()+1;
			int day=date.getDay();
			int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
			String q=s.next();
			if(q.length()!=18)
			{
				System.out.println("�������,ע�ⳤ��");
			}else
			{
				int nian=Integer.valueOf(q.substring(6,10));
				int yue=Integer.valueOf(q.substring(10,12));
				int ri=Integer.valueOf(q.substring(12,14));
				if((nian*10000+yue*100+ri)>(year*10000+yue+100+ri))
				{
					System.out.println("���㴩Խ�İ�");
				}else
				{
					if((nian%4==0&&nian%100!=0)||nian%400==0)
					{
						arr[1]++;
					}
					if(yue>12)
					{
						System.out.println("������ˣ���ȷ��һ�겻��12���£�");
					}else if(ri>arr[yue-1])
					{
						System.out.println("���������������ָͷ����ÿ�����м���");
					}else
					{
						if(quanzhong(q))
						{
							System.out.println("��ȷ");
						}else
						{
							System.out.println("������ˣ�������࿴�Ƶĺܿ�ѧ");
						}
					}
				}
			}
			
		}
	}
	public static boolean quanzhong(String q)
	{
		q=q.toLowerCase();
		int[] arr={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		String[] arr2={"1","0","x","9","8","7","6","5","4","3","2"};
		int sum=0;
		for(int a=0;a<17;a++)
		{
			sum+=arr[a]*Integer.parseInt(q.substring(a, a+1));
			//System.out.println(q.substring(a, a+1));
		}
		sum=sum%11;
		return arr2[sum].equals(q.substring(17,18))?true:false;
	}
}
