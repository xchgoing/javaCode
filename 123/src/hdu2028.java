import java.util.Scanner;


public class hdu2028
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			int arr[];
			arr=new int[a];
			int max=0;
			int ji=1;
			for(int b=0;b<a;b++)
			{
				arr[b]=s.nextInt();
				ji=ji*arr[b];
				if(arr[b]>max)max=arr[b];
			}
			int count=0;
			for(int zx=max;zx<=ji;zx++)
			{
				//System.out.println(zx);
				for(int b=0;b<a;b++)
				{
					//System.out.println(arr[b]);
					if(zx%arr[b]==0)count++;
				}
				if(count==a)
				{
					System.out.println(zx);
					break;
				}
				count=0;
			}
			
		}

	}

}
