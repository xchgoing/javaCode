package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class hdu3487wa
{
    public static void main(String[] args) throws IOException
    {
    	StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    	while(in.nextToken()!=StreamTokenizer.TT_EOF)
    	{
    		List<Integer> arr=new ArrayList();
    		List<Integer> temp=new ArrayList();
    		int n=(int) in.nval;
            in.nextToken();
    		for(int a=1;a<=n;a++)
    		{
    			arr.add(a);
    		}
    		int m=(int) in.nval;
            in.nextToken();
    		if(n==-1&&m==-1)break;
    		for(int a=0;a<m;a++)
    		{
    			String chose=String.valueOf((int) in.nval);
                in.nextToken();
    			if(chose.equals("CUT"))
    			{
    				int q=(int) in.nval;
    	            in.nextToken();
    				int w=(int) in.nval;
    	            in.nextToken();
    				int e=(int) in.nval;
    	            in.nextToken();
    				for(int b=q-1;b<w;b++)
    				{
    					temp.add(arr.remove(q-1));
//    					System.out.println(temp.toString());
    				}
    				while(temp.size()!=0)
    				{
    					arr.add(e, temp.remove(temp.size()-1));
    				}
//    				System.out.println(arr.toString());
    				
    			}else
    			{
    				int q=(int) in.nval;
    	            in.nextToken();
//    				System.out.println(q);
    				int w=(int) in.nval;
    	            in.nextToken();
    				for(int b=q-1;b<w-1;b++)
    				{
    					temp.add(arr.remove(q-1));
//    					System.out.println(temp.toString());
    				}
    				while(temp.size()!=0)
    				{
    					
    					arr.add(q, temp.remove(0));
    				}
//    				System.out.println(arr.toString());
    			}
    		}
    		for(int x=0;x<arr.size();x++)
    		{
    			if(x==0)
    			{
    				System.out.print(arr.get(x));
    			}else
    			{
    				System.out.print(" "+arr.get(x));
    			}
    		}
    		System.out.println();
    	}
    }
 
}