import java.util.Arrays;
import java.util.Scanner;


public class 牛客小白月赛
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		String[] arr={"_","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","."};
		while(s.hasNextInt())
		{
			int k=s.nextInt();
			if(k==0)break;
			String q=s.next();
			int n=q.length();
			int[] cc=new int[n];
			int[] pc=new int[n];
			for(int a=0;a<n;a++)
			{
				for(int b=0;b<arr.length;b++)
				{
					if(q.substring(a, a+1).equals(arr[b]))
					{
						cc[a]=b;
						break;
					}
				}
			}
			for(int a=0;a<n;a++)
			{
				for(int b=0;b<28;b++)
				{
					if(cc[a]==((b-a)%28>=0?(b-a)%28:28-Math.abs((b-a)%28)%28))
					{
						pc[k*a%n]=b;
						break;
					}
				}
			}
//			System.out.println(Arrays.toString(cc));
//			System.out.println(Arrays.toString(pc));
			for(int a=0;a<n;a++)
			{
				System.out.print(arr[pc[a]]);
			}
			System.out.println();
		}
	}	
}
