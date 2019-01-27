package acm2018;


import java.util.Scanner;

public class niukestringproblem
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			 String input=s.next();
			 String end="Just a legend";
			 if(input.length()<3)
			 {
				 System.out.println(end);
				 continue;
			 }else
			 {
				 
				 for(int a=0;a<=input.length()/3;a++)
				 {
					 String q=input.substring(0,a+1);
					 String w=input.substring(input.length()-a-1,input.length());
					 if(q.equals(w)&&input.substring(1,input.length()-1).contains(q))
					 {
						 end=q;
					 }
				 }
					 System.out.println(end);
			 }
		}
	}

}
