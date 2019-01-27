package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class ls
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;
			in.nextToken();
			for(int a=0;a<n;a++)
			{
				int people=(int)in.nval;
				in.nextToken();
				int[] price=new int[people];
				int[] time=new int[people];
				for(int b=0;b<people;b++)
				{
					price[b]=(int)in.nval;
					in.nextToken();
				}
				int temp=0;
				for(int b=0;b<people;b++)
				{
					time[b]=(int)in.nval-temp;
					in.nextToken();
					temp+=time[b];
				}
				sort(time,price,0,time.length-1);
				double ant=0;
				double anp=0;
				for(int b=0;b<time.length;b++)
				{
					if(ant==time[b])continue;
					double empty=0;
					int count=0;
					for(int c=0;c<time.length&&time[c]<=time[b];c++)
					{
						empty+=price[c];
						count++;
					}
					empty/=count;
					if(empty>anp)
					{
						anp=empty;
						ant=(double) time[b];
					}
				}
				out.printf("%.6f ",ant);
				out.println(String.format("%.6f",anp));
			}
		}
		out.flush();
	}
	public static void sort(int[] a,int[] b,int low,int hight)
	{
		int start=low;
		int end=hight;
		int key=a[low];
		
		while(start<end)
		{
			while(end>start&&a[end]>=key)
			{
				end--;
			}
			if(a[end]<key)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				temp=b[start];
				b[start]=b[end];
				b[end]=temp;
			}
			
			while(end>start&&a[start]<=key)
			{
				start++;
			}
			if(a[start]>key)
			{
				int temp=a[end];
				a[end]=a[start];
				a[start]=temp;
				temp=b[end];
				b[end]=b[start];
				b[start]=temp;
			}
		}
		if(start>low)sort(a,b,low,start-1);
		if(end<hight)sort(a,b,end+1,hight);
	}

}
