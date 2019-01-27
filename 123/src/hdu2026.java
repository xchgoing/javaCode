import java.util.Scanner;


public class hdu2026
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			
			String shuru=s.nextLine();
			String[] arr=shuru.split(" ");
			//System.out.println(arr.length);
			for(int a=0;a<arr.length;a++)
			{
				String l=arr[a].substring(0, 1);
				char q=l.charAt(0);
				//System.out.println((int)q);
			    char ls=arr[a].charAt(0);
				char lss=arr[a].toUpperCase().charAt(0);
				//System.out.println(ls+" "+lss);
				//String lls=arr[a];
				//lls=lls.replace(ls,lss);
				if(a<arr.length-1)System.out.print(lss+arr[a].substring(1)+" ");
				else System.out.print(lss+arr[a].substring(1));
			}
			System.out.println();
			/*for(String a:arr)
			{
				System.out.print(a+" ");
			}
			System.out.println();*/
					
					
					
		}

	}

}
