package hud;
import java.util.Arrays;
import java.util.Scanner;
public class hdu2037
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int[][] arr=new int[n][2];
			for(int a=0;a<n;a++)
			{
				arr[a][0]=s.nextInt();
				arr[a][1]=s.nextInt();
			}
			paixu(arr);
			int count=1;
			int endtime=arr[0][1];
			for(int a=1;a<arr.length;a++)
			{
				if(arr[a][0]>=endtime)
				{
					count++;
					endtime=arr[a][1];
				}
			}
			System.out.println(count);
		}
	}
	public static int[][] paixu(int[][] arr)
	{
		int[] arr1=new int[arr.length];
		for(int a=0;a<arr.length;a++)
		{
			arr1[a]=arr[a][0]+arr[a][1]*10000;
		}
		Arrays.sort(arr1);
		for(int a=0;a<arr.length;a++)
		{
			arr[a][0]=arr1[a]%10000;
			arr[a][1]=arr1[a]/10000;
		}
		return arr;
	}

}
