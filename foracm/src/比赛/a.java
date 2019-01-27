package ±ÈÈü;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class a 
{  
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		BigInteger a[]=new BigInteger [100];
		while(s.hasNext())
		{
		   String c="T.T^__^";
		   a[0]=BigInteger.valueOf(4);
		   a[1]=BigInteger.valueOf(3);
		   for(int i=2;i<100;i++)
		   {
			   a[i]=a[i-1].add(a[i-2]);
		   }
		   while(s.hasNext())
		   {
		       BigInteger n=s.nextBigInteger();
		      // System.out.println(n);
		       int q=0;
		       for(int i=1;i<100;i++)
		       {
		    	   if(n.compareTo(a[i])<=0&&n.compareTo(a[i-1])>=0)
		    	   {
		    		   q=i;
		    		   break;
		    	   }
		       }
		      // System.out.println(q);
		       int q2=q-2;
		       int q1=q-1;
		       while(n.compareTo(BigInteger.valueOf(7))>0)
		       { 
		    	  // System.out.println(n+"***"+a[q1]+"----"+q2+":"+a[q2]+" "+q1+":"+a[q1]);
		    	   
		    		   if(n.compareTo(a[q1])>0)
		    		   {
		    			 // System.out.println("--------");
		    		      n=n.subtract(a[q1]);
		    		      q1=q2-1;
		    		      q2=q2-2;
		    		     
		    		   }
		    		   else
			    	   {
		    			   q1=q2;
			    		   q2=q2-1;
			    		  
			    	   }
		       }
		       String t1=n+"";
		       int t= Integer.parseInt(t1); 
		       System.out.println(c.charAt(t-1));
		   }
		   
		}
	}
}