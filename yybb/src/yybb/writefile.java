package yybb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writefile
{

	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner (System.in);
		File file=new File("F:/yybb/qwe.txt");
		FileWriter in=new FileWriter(file);
		while(s.hasNext())
		{
			String input=s.nextLine();
			if(input.equals("out"))break;
			in.write(input);
		}
		in.close();
		
		Test05.go(args);
	}

}
