package zuoye;

import java.util.Arrays;
import java.util.Random;

public class zy122
{

	public static void main(String[] args)
	{
		Random r=new Random();
		int[] arr=new int[100];
		int min=300;
		for(int a=0;a<100;a++)
		{
			arr[a]=(r.nextInt(201)+1)-101;
			if(Math.abs(arr[a])<Math.abs(min))min=arr[a];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(min);
	}

}
