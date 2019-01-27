import java.util.Arrays;


public class alist
{
	String[] arr=new String[10];
	int size=10;
	int next=0;
	
	public void add(String input)
	{
		checksize();
		arr[next]=input;
		next++;
	}
	
	private void checksize()
	{
		if(size==next)
		{
			arr=Arrays.copyOf(arr,arr.length+10);
			size=arr.length;
		}
	}
	
	public String get(int index)
	{
		return arr[index];
	}
	
	public int size()
	{
		return size;
	}

}


