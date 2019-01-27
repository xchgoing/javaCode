import java.util.Scanner;
public class hdu2010
{
    public static void main(String[] args)
	{
		int m=0,n=0;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int count=0;
			String end="";
			String end0="";
			m=s.nextInt();
			n=s.nextInt();
			if(m<100||n>999)
			{
				break;
			}
			if(m>n)
			{
				int q=m;
				m=n;
				n=q;
			}
			for(int w=m;w<=n;w++)
			{
				if(w==(w/100)*(w/100)*(w/100)+((w/10)%10)*((w/10)%10)*((w/10)%10)+(w%10)*(w%10)*(w%10))
				{
					count++;
					String t=String.valueOf(w);
					end=end+" "+w;
				}
			}
			if(count==0)
			{
				System.out.println("no");
			}else
			{
				end0=end.trim();
				char[]ch=end0.toCharArray();
				System.out.println(ch);
			}
	   }
    }
}