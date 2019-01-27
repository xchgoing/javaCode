
import java.util.Scanner;
public class text	
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String temp=s.nextLine();
			while(temp.contains("~~"))
			{
				temp=temp.replaceAll("~~", "~");
			}
			String[] arr=temp.split("~");
			temp="";
			temp=arr[1]+" "+dz(arr[3])+" "+dz(arr[4])+" "+number(arr[4])+" "+number(arr[3]);
			System.out.println(temp);
		}
	}
	public static String number(String q)
	{
		int nl=q.length();
		for(int a=nl-1;a>-1;a--)
		{
			if((q.charAt(a)!=45)&&(q.charAt(a)<48||q.charAt(a)>57))
			{
				return q.substring(a+1,q.length());
			}
		}
		return "no return";
	}
	public static String dz(String q)
	{
		int nl=q.length();
		for(int a=nl-1;a>-1;a--)
		{
			if((q.charAt(a)!=45)&&(q.charAt(a)<48||q.charAt(a)>57))
			{
				return q.substring(0,a+1);
			}
		}
		return "no return";
	}
}
