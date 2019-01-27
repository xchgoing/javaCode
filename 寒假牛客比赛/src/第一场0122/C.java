package µÚÒ»³¡0122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			ArrayList<Integer> list =new ArrayList();
			int start=0;
			int end=0;
			for(int a=0;a<n;a++)
			{
				if(a==0){
					start=s.nextInt();
					list.add(start);
				}else if(a==n-1)
				{
					end=s.nextInt();
					list.add(end);
				}else 
				{
					int temp=s.nextInt();
					if(start>temp)
					{
						list.add(temp);
					}
				}
			}
			Integer[] arr=list.toArray(new Integer[list.size()]); 
			Arrays.sort(arr,(Integer a,Integer b)->(b-a));
			if(arr[0]!=start)
			{
				System.out.println(-1);
			}else
			{
				
			}
		}
	}

}
