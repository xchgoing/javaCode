package otheroj;



import java.util.Arrays;
import java.util.Scanner; 


public class zoj3785
{

	public static void main(String[] args) 
	{
		int[] arr2={2,4,1};
		int[] arr3={3,2,6,4,5,1};
		int[] arr4={4,2,1};
		int[] arr5={5,4,6,2,3,1};
		int[] arr6={6,1};
		Scanner s=new Scanner(System.in);
	    while(s.hasNextInt())
	    {
	        int n=s.nextInt();
	        for(int p=0;p<n;p++)
	        {
	        	int r=0;
		    	int q=294;
		    	for(int a=1;a<=q;a++)
		    	{
		    		int w=a%7;
			    	if(w==1)
			    	{
			    		r=1;
			    	}
			    	else if(w==2)
			    	{
			    		if(a%arr2.length==0)
			    		{
			    			r+=arr2[arr2.length-1];
			    		}else
			    		{
			    			r+=arr2[a%arr2.length-1];
			    		}
			    	}
			    	else if(w==3)
			    	{
			    		if(a%arr3.length==0)
			    		{
			    			r+=arr3[arr3.length-1];
			    		}else
			    		{
			    			r+=arr3[a%arr3.length-1];
			    		}
			    	}else if(w==4)
			    	{
			    		if(a%arr4.length==0)
			    		{
			    			r+=arr4[arr4.length-1];
			    		}else
			    		{
			    			r+=arr4[a%arr4.length-1];
			    		}
			    	}else if(w==5)
			    	{
			    		if(a%arr5.length==0)
			    		{
			    			r+=arr5[arr5.length-1];
			    		}else
			    		{
			    			r+=arr5[a%arr5.length-1];
			    		}
			    	}else if(w==6)
			    	{
			    		if(a%arr6.length==0)
			    		{
			    			r+=arr6[arr6.length-1];
			    		}else
			    		{
			    			r+=arr6[a%arr6.length-1];
			    		}
			    	}
			    	r=r%7;
			    	System.out.println(r);
			    	if(a%49==0)System.out.println();
		    	}
	        }
	    }
	}
}