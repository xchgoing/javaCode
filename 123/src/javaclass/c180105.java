package javaclass;

import java.util.Scanner;

public class c180105
{

	public static void main(String[] args)
	{
		
		while(true)
		{
			Scanner s=new Scanner (System.in);
			/*String q="99999";
			int w=Integer.parseInt(q.substring(0, 1));
			System.out.println(w+w);
			break;*/
			try 
			{
				System.out.println("如果你看到停在我这里了，那么你就成功了");
				int q=s.nextInt();
				System.out.println("ok");
				int w=s.nextInt();
				System.out.println("ok");
				int r=s.nextInt();
				System.out.println("ok");
				int t=s.nextInt();
				System.out.println("ok");
			}
			catch(Exception e)
			{
				s.reset(); 
				System.out.println("hehe");
			}
		}
	}

}
