package ÌìÌÝ×Ü;

import java.util.HashSet;
import java.util.Scanner;

public class L1L003
{

	public static void main(String[] args)
	{
		HashSet<Character> set=new HashSet();
		Scanner s=new Scanner (System.in);
		int max=0;
		while(s.hasNextInt())
		{
			set.clear();
			max=0;
			int n=s.nextInt();
			if(n==-1)break;
			String anwer=s.next();
			String guess=s.next();
			for(int a=0;a<anwer.length();a++)
			{
				set.add(anwer.charAt(a));
			}
			for(int a=0;a<guess.length();a++)
			{
				if(set.contains(guess.charAt(a)))
				{
					set.remove(guess.charAt(a));
					if(set.size()==0)break;
				}else
				{
					max++;
					if(max==7)break;
				}
			}
			System.out.println("Round "+n);
			if(max==7)
			{
				System.out.println("You lose.");
			}else if(set.size()==0)
			{
				System.out.println("You win.");
			}else
			{
				System.out.println("You chickened out.");
			}
			
		}
	}

}
