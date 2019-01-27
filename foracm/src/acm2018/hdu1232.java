package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1232 
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    while(s.hasNextInt())
	    {
	    	int city=s.nextInt();
	    	if(city==0)break;
	    	int[] arr=new int[city+1];
	    	int way=s.nextInt();
	    	for(int b=1;b<arr.length;b++)
	    	{
	    		arr[b]=b;
	    	}
	    	for(int a=0;a<way;a++)
	    	{
	    		int temp1=s.nextInt();
	    		int temp2=s.nextInt();
	    		int temp=arr[temp1];
	    		for(int b=1;b<arr.length;b++)
	    		{
	    			if(arr[b]==temp)
	    			{
	    				arr[b]=arr[temp2];
	    			}
	    		}
	    	}
	    	int count=-1;
	    	Arrays.sort(arr);
	    	for(int a=1;a<arr.length;a++)
	    	{
	    		if(arr[a]!=arr[a-1])count++;
	    	}
	    	System.out.println(count);
	    }
	}
}