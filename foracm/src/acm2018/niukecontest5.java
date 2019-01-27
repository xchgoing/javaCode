package acm2018;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;
 
public class niukecontest5
{
 
    public static void main(String[] args) throws IOException
    {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while(in.nextToken()!=StreamTokenizer.TT_EOF)
        {
            int n=(int) in.nval;
            in.nextToken();
            int[] arr=new int[n+1];
            arr[0]=0;
            int m=(int) in.nval;
            in.nextToken();
            for(int a=1;a<n+1;a++)
            {
            	arr[a]=arr[a-1]+(int) in.nval;
                in.nextToken();
            }
            for(int a=0;a<m;a++)
            {
                int temp=(int) in.nval;
                in.nextToken();
                if(temp==1)
                {
                    int q=(int) in.nval;
                    in.nextToken();
                    int w=(int) in.nval;
                    in.nextToken();
                    for(int b =q-1;b<n;b++)
                    {
                    	arr[b]+=w;
                    }
                }else if(temp==2)
                {
                    int q=(int) in.nval;
                    in.nextToken();
                    int w=(int) in.nval;
                    in.nextToken();
                    System.out.println(arr[w]-arr[q-1]);
                }
            }
        }
        out.flush();
    }
 
}