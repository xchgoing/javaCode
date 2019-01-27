package acm2018;
import java.util.Scanner;
import java.util.Stack;


public class poj1028
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Stack<String> now=new Stack<String>();
		now.push("http://www.acm.org/");
		Stack<String> save=new Stack<String>();
		while(s.hasNext())
		{
			String q=s.next();
			if(q.equals("VISIT"))
			{
				String v=s.next();
				now.push(v);
				System.out.println(v);
				save.clear();
			}else if(q.equals("BACK"))
			{
				if(now.size()>1)
				{
					save.push(now.pop());
					System.out.println(now.peek());
				}else
				{
					System.out.println("Ignored");
				}
			}else if(q.equals("FORWARD"))
			{
				if(save.isEmpty())
				{
					System.out.println("Ignored");
				}else
				{
					now.push(save.pop());
					System.out.println(now.peek());
				}
			}else if(q.equals("QUIT"))
			{
				break;
			}
		}
	}

}
