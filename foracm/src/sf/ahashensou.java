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
		int count=0;//��ʾ��ȷ�𰸵ĸ���
		int p=10;//��ʾ�����Եĸ���
		int n=100;//n��ʾ�ܳ���
		int[] box=new int[n];//����ģ����ӵĸ���
		int[] book=new int[p];//����ģ������Եĸ���
		if(step==n)//�Ѿ��ڵ�n�����ӱ����ˣ���ʾ����
		{
//			if(�б�ʽ�ж��ǲ�����ȷ��)
//			{
//				���Ƿ���֮ǰһ��������õĵط���
//			    count++;return;
//			}
			for(int a=0;a<p;a++)//�����������ҳ�û���ù����Ǹ�
			{
				if(book[a]==0)//book[a]==0��ʾ���������û��ʹ�ù�
				{
					box[step]=a;//�ѵ�a�ֿ����Էŵ���step��������
					book[a]=1;//��ǿ����Ա�ʾ�Ѿ��ù���
					
					dfs(step+1);//��ʼ��һ�����ӿ����Եļ���
					book[a]=0;//��ʼ���ص���Ҫ���˴��ù��Ŀ����Իع鵽δʹ�õ�״̬
				}
			}
			return;//����
		}
	}
}
