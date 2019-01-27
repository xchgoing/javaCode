package zuoye;
import java.util.Arrays;
import java.util.Random;
public class zy121
{
	public static void main(String[] args)
	{
		Random r=new Random();
		int[] arr=new int[101];
		for(int a=0;a<101;a++)
		{
			arr[a]=r.nextInt(100)+1;
		}
		System.out.println("数组"+Arrays.toString(arr));
		for(int a=0;a<101;a++)
		{
			if(arr[a]!=0&&cs(arr,arr[a])==2)
			{
				System.out.print("数字"+arr[a]+" "+"下标");
				System.out.println(xb(arr,arr[a]));
			}
		}
	}
	public static int cs(int[] arr,int q)
	{
		int count=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]==q)
			{
				count++;
			}
		}
		return count;
	}
	public static String xb(int[] arr,int q)
	{
		String temp="";
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]==q)
			{
				temp=temp+Integer.toString(a)+" ";
				arr[a]=0;
			}
		}
		return temp;
	}
}
