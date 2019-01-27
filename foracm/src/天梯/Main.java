package ÌìÌÝ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 
//qian  dao   biao  zuo  guo
public class Main
{
 
    public static void main(String[] args) 
    {
        Scanner s=new Scanner (System.in);
        int flag=0;
        while(s.hasNextInt())
        {
        	flag++;
            int n=s.nextInt();
            Stack<Integer> le=new Stack<Integer>();
            Stack<Integer> ri=new Stack<Integer>();
            Stack<Integer> temps=new Stack<Integer>();
            ArrayList<Integer> list=new ArrayList<>(); 
            int[] result=new int[n];
            for(int a=1;a<n+1;a++)
            {
                list.add(a);
            }
            int[] arr=new int[n+1]; //±í×´Ì¬
            String q=s.next();
            for(int a=0;a<n;a++)
            {
                if(q.charAt(a)=='U')arr[a+1]=1;
                else arr[a+1]=-1;
            }
            String fz=s.next();
            for(int a=0;a<fz.length();a++)
            {
                if(fz.charAt(a)=='L'&&le.size()==0)
                {
                	int t=list.remove(0);
                    le.push(t);
                }
                if(fz.charAt(a)=='R'&&ri.size()==0)
                {
                	int t=list.remove(list.size()-1);
                    ri.push(t);
                }
                if(list.size()!=0)
                {
                    if(fz.charAt(a)=='L')
                    {
                        temps.push(list.remove(0));
                        while(le.size()!=0)
                        {
                            int t=le.pop();
                            arr[t]=0-arr[t];
                            temps.push(t);
                             
                        }
                        le=temps;
                        temps=new Stack<Integer>();
                    }else
                    {
                        temps.push(list.remove(list.size()-1));
                        while(ri.size()!=0)
                        {
                            int t=ri.pop();
                            arr[t]=0-arr[t];
                            temps.push(t);
                             
                        }
                        ri=temps;
                        temps=new Stack<Integer>();
                    }
                }else
                {
                    if(fz.charAt(a)=='L')
                    {
                        while(le.size()!=0)
                        {
                            int t=le.pop();
                            arr[t]=0-arr[t];
                            ri.push(t);
                        }
                    }else
                    {
                        while(ri.size()!=0)
                        {
                            int t=ri.pop();
                            arr[t]=0-arr[t];
                            le.push(t);
                        }
                    }
                }
            }
            if(fz.endsWith("L"))
            {
                for(int a=0;a<n;a++)
                {
                    result[a]=ri.pop();
                }
            }else
            {
                for(int a=0;a<n;a++)
                {
                    result[a]=le.pop();
                }
            }
             
            System.out.println("Case "+flag);
            int check=s.nextInt();
            while(check-->0)
            {
                int cn=s.nextInt();
                System.out.println("Card "+cn+" is a face "+(arr[result[cn-1]]==1?"up":"down")+" "+result[cn-1]+".");
            }
        }
    }
 
}
