package sf;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ��С������
{
	public static void main(String[] args)
	{
		//����ڵ������0~n-1���Ͷ�ȡ������map
		
	}
	public static int prim(int n,int[][] map)
	{
		int[] book=new int[n];//����Ƿ������
		final int max=99999999;
		int count=1;			//count�ĳ�ֵӦ�ø�Ϊ1�����ڵ��Ѿ�������ȥ��
		int min,sum=0;
		int s=-1,e=-1;
		book[0]=1;
		while(true)
		{
			min=max;
			//ȡ����С��·��
			for(int i=0;i<n;i++)
				if(book[i]==1)//���Ѿ���ͨ�Ľڵ���
					for(int j=0;j<n;j++)//ѡȡû����ͨ·����̵Ľڵ�
						if(i!=j && min>map[i][j] && book[j]==0)
						{
							min=map[i][j];
							s=i;
							e=j;
						}
			if(min==max)break;//���minֵû�б������û�нڵ���Լ�������
			count++;
			book[e]=1;
			sum+=map[s][e];
			System.out.println("���������������������"+Arrays.toString(book));
		}
		if(count!=n)return -999999999;
		return sum;
	}
	public static int Ks(int n,int[][] map)//ϡ��ͼ��Ц
	{
		int sum=0;				//��С��������С����
		PriorityQueue<xian> a=new PriorityQueue<xian>();//��С�ѻ����̱�
		//��ʼ����С��
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				a.add(new xian(i,j,map[i][j]));
				a.add(new xian(i,j,map[j][i]));
			}
		int[] b=new int[n];//���鼯�ж��Ƿ��л�·
		//���鼯��ʼ��
		for(int i=0;i<n;i++)
			b[i]=i;
		//��¼��ӵı���
		int count=0;
		//�����������n-1����û�б��ˡ�
		while(count<n-1 && !a.isEmpty())
		{
			xian x=a.poll();//��ȡ��С��
			//��������ߵ����ߵĶ˵㶼û����ͨ����
			if(b[x.left]==x.left && b[x.right]==x.right)
			{
				b[x.right]=x.left;//���Ҷ˵�ָ�����ϵ�
				sum+=x.len;		  //�ۼӴ���
				count++;		  //����++
			}
			//������һ��û����ͨ�����Ѹĵ�ָ����һ������ڡ��ۼӴ��ۡ�����++
			else if(b[x.left]==x.left)
			{
				int temp=x.right;
				while(b[temp]!=temp)
				{
					temp=b[temp];
				}
				if(x.left!=temp)
				{
					b[x.left]=temp;
					sum+=x.len;
					count++;
				}
			}
			else if(b[x.right]==x.right)
			{
				int temp=x.left;
				while(b[temp]!=temp)
				{
					temp=b[temp];
				}
				if(x.right!=temp)
				{
					b[x.right]=temp;
					sum+=x.len;
					count++;
				}
			}
			//����������㶼����ͨ�������������ͬ����γɻ�·����ӣ�������ָ�����ۼӴ��ۣ�����++
			else
			{
				int temp1=x.left,temp2=x.right;
				while(b[temp1]!=temp1)
					temp1=b[temp1];
				while(b[temp2]!=temp2)
					temp2=b[temp2];
				if(temp1!=temp2)
				{
					b[temp2]=temp1;
					sum+=x.len;
					count++;
				}
			}
		}
		if(count+1!=n)return -999999999;
		return sum;
	}

}
class xian implements Comparable<xian>
{
	int left;
	int right;
	int len;
	public xian(int left,int right,int len)
	{
		this.left=left;
		this.right=right;
		this.len=len;
	}
	public int compareTo(xian o)
	{
		return len-o.len;
	}
}



//���鼯+��С��
/*MST�����������д���Ǳ�
 * E�Ƿűߵ���С��
 * ��MST�к��в���V-1���� && E�л��бߵ�ʱ��
 * {
 * ������С�ߣ��Ѷ���
 * �����С����MST�����ɻ�·�������MST
 * �����鼯ʵ�֣�
 * }
 * ���MST�ı�����=v-1����ͼ����ͨ��
 * 
 * */