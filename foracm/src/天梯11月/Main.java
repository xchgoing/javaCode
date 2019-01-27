package ÌìÌÝ11ÔÂ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		while (in.nextToken() != StreamTokenizer.TT_EOF){
			while(true)
			{
				in.nextToken();
				int m=(int)in.nval;
				System.out.println(m);
			}
		}
	}
	
}
