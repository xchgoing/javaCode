package sf;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 最小生成树
{
	public static void main(String[] args)
	{
		//输入节点个数（0~n-1）和读取进来的map
		
	}
	public static int prim(int n,int[][] map)
	{
		int[] book=new int[n];//标记是否遍历过
		final int max=99999999;
		int count=1;			//count的初值应该赋为1（根节点已经包含进去）
		int min,sum=0;
		int s=-1,e=-1;
		book[0]=1;
		while(true)
		{
			min=max;
			//取出最小的路径
			for(int i=0;i<n;i++)
				if(book[i]==1)//在已经连通的节点中
					for(int j=0;j<n;j++)//选取没有连通路径最短的节点
						if(i!=j && min>map[i][j] && book[j]==0)
						{
							min=map[i][j];
							s=i;
							e=j;
						}
			if(min==max)break;//如果min值没有变过，则没有节点可以继续连了
			count++;
			book[e]=1;
			sum+=map[s][e];
			System.out.println("遍历情况→→→→→→→"+Arrays.toString(book));
		}
		if(count!=n)return -999999999;
		return sum;
	}
	public static int Ks(int n,int[][] map)//稀疏图搞笑
	{
		int sum=0;				//最小生成树最小代价
		PriorityQueue<xian> a=new PriorityQueue<xian>();//最小堆获得最短边
		//初始化最小堆
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				a.add(new xian(i,j,map[i][j]));
				a.add(new xian(i,j,map[j][i]));
			}
		int[] b=new int[n];//并查集判断是否有回路
		//并查集初始化
		for(int i=0;i<n;i++)
			b[i]=i;
		//记录添加的边数
		int count=0;
		//如果边数等于n-1或者没有边了。
		while(count<n-1 && !a.isEmpty())
		{
			xian x=a.poll();//获取最小边
			//如果这条边的两边的端点都没有连通过。
			if(b[x.left]==x.left && b[x.right]==x.right)
			{
				b[x.right]=x.left;//把右端点指向做断点
				sum+=x.len;		  //累加代价
				count++;		  //边数++
			}
			//其中有一个没有连通过，把改点指向另一点的祖宗、累加代价、边数++
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
			//如果两个顶点都被连通过，如果祖先相同则会形成回路不添加，否则右指向左，累加代价，边数++
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



//并查集+最小堆
/*MST（）；集合中存的是边
 * E是放边的最小堆
 * 当MST中含有不到V-1条边 && E中还有边的时候：
 * {
 * 弹出最小边（堆顶）
 * 如果最小边在MST不构成回路，则加入MST
 * （并查集实现）
 * }
 * 如果MST的边数！=v-1就是图不连通。
 * 
 * */