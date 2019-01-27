package zuoye;

import java.util.Arrays;

public class sy
{

	public static void main(String[] args)
	{
		String q="qwer.qwer";
		int a=q.indexOf(".");
		System.out.println(a);
		String[] w=q.split("\\.");
		String[] e={"1","2"};
		System.out.println(Arrays.toString(w));

	}

}
