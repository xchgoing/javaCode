import java.util.Scanner;


public class hdu2016
{

	public static void main(String[] args)
	{
		int arr[];
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int min=0;
			int gs=s.nextInt();
			if(gs==0)
			{
				break;
			}
			arr=new int [gs];
			for(int q=0;q<gs;q++)
			{
				arr[q]=s.nextInt();
			}
			for(int a=0;a<gs;a++)
			{
				if(arr[a]<=arr[min])
				{
					min=a;
				}
			}
			int b=arr[0];
			arr[0]=arr[min];
			arr[min]=b;
			for(int c=0;c<gs-1;c++)
			{
				System.out.print(arr[c]+" ");
			}
			System.out.println(arr[gs-1]);
		}
		

	}

}
