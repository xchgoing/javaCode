package sf;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1548
{
	static int[] arr;
	static boolean over;
	static int[] change;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int high=s.nextInt();
			if(high==0)break;
			int start=s.nextInt();
			int end=s.nextInt();
			arr=new int[high+1];
			Arrays.fill(arr,-1);
			arr[start]=0;
			change=new int[high+1];
			for(int a=1;a<high+1;a++)
			{
				change[a]=s.nextInt();
			}
			while(true)
			{
				over=false;
				for(int a=1;a<arr.length;a++)
				{
					 if(arr[a]!=-1)
					 {
						 if(a-change[a]>0)
						 {
							 if(a-change[a]==end)
							 {
								 arr[a-change[a]]=arr[a]+1;
								 if(a-change[a]==end)break;
							 }else if(arr[a-change[a]]==-1)
							 {
								 arr[a-change[a]]=arr[a]+1;
							 }
								 
							 over=true;
						 }
						 if(a+change[a]<=arr.length-1)
						 {
							 if(a+change[a]==end)
							 {
								 arr[a+change[a]]=arr[a]+1;
								 break;
							 }else if(arr[a+change[a]]==-1)
							 {
								 arr[a+change[a]]=arr[a]+1;
							 }
							 over=true;
						 }
					 }
				}
				if(arr[end]!=-1)
				{
					System.out.println(arr[end]);
					break;
				}
				if(over)
				{
					continue;
				}else
				{
					System.out.println("-1");
					break;
				}
			}
			
		}
	}
	public static void select(int[] arr,int[] change,int end)
	{
		over=false;
		for(int a=1;a<arr.length;a++)
		{
			 if(arr[a]!=-1)
			 {
				 if(a-change[a]>0)
				 {
					 if(a-change[a]==end)
					 {
						 arr[a-change[a]]=arr[a]+1;
						 if(a-change[a]==end)break;
					 }else if(arr[a-change[a]]==-1)
					 {
						 arr[a-change[a]]=arr[a]+1;
					 }
						 
					 over=true;
				 }
				 if(a+change[a]<=arr.length-1)
				 {
					 if(a+change[a]==end)
					 {
						 arr[a+change[a]]=arr[a]+1;
						 break;
					 }else if(arr[a+change[a]]==-1)
					 {
						 arr[a+change[a]]=arr[a]+1;
					 }
					 over=true;
				 }
			 }
		}
		if(arr[end]!=-1)
		{
			System.out.println(arr[end]);
			return;
		}
		if(over)
		{
			select(arr,change,end);
		}else
		{
			System.out.println("-1");
			return;
		}
		return;
	}
}
