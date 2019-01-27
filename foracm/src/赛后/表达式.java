package 赛后;


import java.util.Scanner;

public class 表达式 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.nextLine();
//			String[] arr=q.split(" ");
//			for(int a=0;a<arr.length;a++)
//			{
//				System.out.println(arr[a]);
//			}
//			int q=Integer.valueOf("");
//			System.out.println(q);
			System.out.println(js(q));
		}
	}
	public static String js(String q)
	{
		while(true)
		{
			q=q.replaceFirst("\\*", " ");
			if(!q.contains(" "))
			{
				break;
			}
			String[] temp=q.split(" ");
			double qian=0;
			double hou=0;
			for(int a=0;a<temp[1].length();a++)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==temp[1].length()-1))
				{
					try{
						if(a==temp[1].length()-1)a++;
						hou=Double.valueOf(temp[1].substring(0,a));
						temp[1]=temp[1].substring(a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			
			for(int a=temp[0].length()-1;a>=0;a--)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==0))
				{
					try{
						qian=Double.valueOf(temp[0].substring(a,temp[0].length()));
						temp[0]=temp[0].substring(0,a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			q=temp[0]+String.valueOf(qian*hou)+temp[1];
		}
		while(true)
		{
			q=q.replaceFirst("\\/", " ");
			if(!q.contains(" "))
			{
				break;
			}
			String[] temp=q.split(" ");
			double qian=0;
			double hou=0;
			for(int a=0;a<temp[1].length();a++)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==temp[1].length()-1))
				{
					try{
						if(a==temp[1].length()-1)a++;
						hou=Double.valueOf(temp[1].substring(0,a));
						temp[1]=temp[1].substring(a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			
			for(int a=temp[0].length()-1;a>=0;a--)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==0))
				{
					try{
						qian=Double.valueOf(temp[0].substring(a,temp[0].length()));
						temp[0]=temp[0].substring(0,a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			q=temp[0]+String.valueOf(qian/hou)+temp[1];
		}
		while(true)
		{
			q=q.replaceFirst("\\+", " ");
			if(!q.contains(" "))
			{
				break;
			}
			String[] temp=q.split(" ");
			double qian=0;
			double hou=0;
			for(int a=0;a<temp[1].length();a++)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==temp[1].length()-1))
				{
					try{
						if(a==temp[1].length()-1)a++;
						hou=Double.valueOf(temp[1].substring(0,a));
						temp[1]=temp[1].substring(a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			
			for(int a=temp[0].length()-1;a>=0;a--)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==0))
				{
					try{
						qian=Double.valueOf(temp[0].substring(a,temp[0].length()));
						temp[0]=temp[0].substring(0,a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			q=temp[0]+String.valueOf(qian+hou)+temp[1];
		}
		
		while(true)
		{
			q=q.replaceFirst("\\-", " ");
			if(!q.contains(" "))
			{
				break;
			}
			String[] temp=q.split(" ");
			double qian=0;
			double hou=0;
			for(int a=0;a<temp[1].length();a++)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==temp[1].length()-1))
				{
					try{
						if(a==temp[1].length()-1)a++;
						hou=Double.valueOf(temp[1].substring(0,a));
						temp[1]=temp[1].substring(a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			
			for(int a=temp[0].length()-1;a>=0;a--)
			{
				if(((q.charAt(a)-'0'<0||q.charAt(a)-'0'>9)&&q.charAt(a)-'.'!=0)||(a==0))
				{
					try{
						qian=Double.valueOf(temp[0].substring(a,temp[0].length()));
						temp[0]=temp[0].substring(0,a);
						break;
					}
					catch(Exception e){
						return "Wrong";
					}
				}
			}
			q=temp[0]+String.valueOf(qian-hou)+temp[1];
		}
		return q;
		
	}

}
