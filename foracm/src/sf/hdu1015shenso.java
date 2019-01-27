package sf;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1015shenso
{
	static int[] box=new int[5];
	static int[] book;
	static int[] tag;
	static boolean over=false;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			over=false;
			int end=s.nextInt();
			String q=s.next();
			if(end==0&&q.equals("END"))break;
			book=new int[q.length()];
			if(q.length()<5)
			{
				System.out.println("no solution");
				continue;
			}
			for(int a=0;a<q.length();a++)
			{
				book[a]=1+q.charAt(a)-'A';
			}
			Arrays.sort(book);
			for(int a=0;a<book.length/2-1;a++)
			{
				int temp=book[a];
				book[a]=book[book.length-1-a];
				book[book.length-1-a]=temp;
			}
			tag=new int[book.length];
			dfs(tag,book,0,end);
		}
	}
	public static void dfs(int[] tag,int[] book,int step,int end)
	{
		if(step==5)
		{
			if(box[0]-Math.pow(box[1], 2)+Math.pow(box[2],3)-Math.pow(box[3],4)+Math.pow(box[4], 5)==end)
			{
				String q=String.valueOf((char)(box[0]+'A'-1))+String.valueOf((char)(box[1]+'A'-1))+String.valueOf((char)(box[2]+'A'-1))+String.valueOf((char)(box[3]+'A'-1))+String.valueOf((char)(box[4]+'A'-1));
				System.out.println(q);
				over=true;
				return;
			}
			else
			{
				return;
			}
		}
		for(int a=0;a<book.length;a++)
		{
			if(tag[a]==0)
			{
				box[step]=book[a];
				tag[a]=1;
				
				dfs(tag,book,step+1,end);
				if(over)break;
				tag[a]=0;
			}
		}
		if(!over&&step==0)
		{
			System.out.println("no solution");
			over=true;
		}
		return;
	}
}
