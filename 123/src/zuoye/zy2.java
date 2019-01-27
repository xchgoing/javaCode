package zuoye;
import java.util.Scanner;
public class zy2
{
    public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		loop:while(s.hasNext())
		{
			String a="";
			String zs="";
			a=s.nextLine();
			char[] b=a.toCharArray();
			loop2:for(int i=0;i<b.length;i++)
			{
				switch(b[i])
				{
				  case '1':
					  zs=zs+"A";break;
				  case '0':
					  if(i<b.length-1)
					  {
						  switch(b[i+1])
						  {
						     case '1':zs=zs+"B";i+=1;continue loop2;
						     case '0':
						    	 if(i<b.length-2&&b[i+2]=='1')
						    	 {
						    		 zs=zs+"C";i+=2;continue loop2;
						    	 }else
						    	 {
						    		 System.out.println("ÄãÊä´íÁË");break loop;
						    	 }
						     default:
						     {
						    	 System.out.println("ÄãÊä´íÁË");break loop;
						     }
						  }
					  }else
					  {
						  System.out.println("ÄãÊä´íÁË");break loop;
					  }
				  default:
				  {
					  System.out.println("ÄãÊä´íÁË");break loop;
				  }
				}
			}
			System.out.println(zs);
		}
    }
}
