import java.util.Arrays;
import java.util.Scanner;

public class Main {                                   //ps����ͬ��˼·���ദ��ᳬʱ

public static void main(String[] args) 
{
	Scanner in=new Scanner(System.in);
	int n,m,count=0,a,b;
	while(in.hasNextInt())
	{
		count++;                                     //�����ʽ
		if(count>1)System.out.println();
		System.out.printf("Case %d:\n",count);
		
		
		n=in.nextInt();                              //���ݶ���             
		m=in.nextInt();
		
		
		int[] num=new int[n+1];//�游�ڵ�                      //������
		int[] cc=new int[n+1];//������
		
		for(int i=1;i<=n;i++)                      //��ֵ���ڵ�������Լ�����������Ϊ1                 
		{
			num[i]=i;
			cc[i]=1;
		}
		
		
		while(m-->0)                                //��ʼ�ж�
		{
			String s=in.next();
			if(s.equals("M"))                        //�����M
			{
				a=in.nextInt();                     //����
				b=in.nextInt();
				
				int temp1=a,temp2=b;                //�ҽڵ�
				while(num[temp1]!=temp1)
				temp1=num[temp1];
				while(num[temp2]!=temp2)
				temp2=num[temp2];
				
				if(temp1!=temp2)                   //�������
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
			else if(s.equals("Q"))               //���
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