package acm2018;
import java.util.Scanner;
public class zoj3311
{
	public static void main(String[] args)
	{//王一舟的方法
		Scanner s=new Scanner (System.in);
		String m="O*ZO+JO+";
		int temp;
		while(s.hasNext())
		{
			String q=s.nextLine();
			String out="Accepted";
			if(q.matches(m))
			{
				temp=q.indexOf("J");
				if(temp==q.length()-temp-1)
					System.out.println("Accepted");
			}
			else System.out.println("Wrong Answer");
		}
	}
	/*我的方法
	package acm2018;
	import java.util.Scanner;
	public class test
	{
		public static void main(String[] args)
		{
			Scanner s=new Scanner (System.in);
			while(s.hasNext())
			{
				String q=s.nextLine();
				String out="Accepted";
				if((q.length()-q.replace("Z","").length()!=1)||(q.length()-q.replace("J","").length()!=1))
				{
					out="Wrong Answer";
				}else
				{
					if(q.indexOf("Z")+1==q.indexOf("J"))out="Wrong Answer";
					if(q.indexOf("Z")>q.indexOf("J"))out="Wrong Answer";
					if(!(q.indexOf("J")==q.length()-q.indexOf("J")))out="Wrong Answer";
				}
				System.out.println(out);
			}
		}
	}*/
}
