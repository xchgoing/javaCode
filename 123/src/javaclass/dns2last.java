package javaclass;

import java.util.Arrays;
import java.util.Scanner;

public class dns2last
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String q=s.next();
			int[] arr=new int[q.length()];
			int sum=0;
			int is0=0;
			int is5=0;
			for(int a=0;a<q.length();a++)
			{
				arr[a]=Integer.valueOf(q.substring(a, a+1));
				sum+=arr[a];
				if(arr[a]==0)is0++;
				if(arr[a]==5)is5++;
			}
			if(sum==0)
			{
				System.out.println("impossible");
			}else
			{
				sum=sum%3;
				daopai(arr);
				if(is0==0&&is5==0)
				{
					System.out.println("impossible");
				}else if(is0!=0)
				{
					if(sum==0)
					{
						print(arr);
					}else
					{
						int d;
						loop:for(d=sum;d<10;d+=3)
						{
							for(int b=0;b<arr.length;b++)
							{
								if(arr[b]%3==sum)
								{
									if(qiuhe(arr1(arr,arr[b]))==0)
									{
										System.out.println("impossible");
									}
									else
									{
										print(arr1(arr,arr[b]));
									}
									//System.out.println("1");
									break loop;
								}
							}
						}
						if(d>=10)
						{
							int sum1=0;
							lqq:for(int b=arr.length-1;b>0;b--)
							{
								for(int v=b-1;v>=0;v--)
								{
									sum1=arr[b]+arr[v];
									if(sum1%3==sum)
									{
										if(qiuhe(arr1(arr1(arr,arr[b]),arr[v]))==0)
										{
											System.out.println("impossible");
										}
										else
										{
											print(arr1(arr1(arr,arr[b]),arr[v]));
										}
										//System.out.println("2");
										break lqq;
									}
								}
								if(b-1<0)
								{
									System.out.println("impossible");
								}
							}
						}
					}
				}else if(is5!=0&&is0==0)
				{
					if(sum==0)
					{
						print(arr5(arr));
					}else
					{
						int d;
						loop:for(d=sum;d<10;d+=3)
						{
							for(int b=0;b<arr.length;b++)
							{
								if(arr[b]%3==sum)
								{
									if(arr[b]!=5||is5>1)
									{
										if(qiuhe(arr5(arr1(arr,arr[b])))==0)
										{
											System.out.println("impossible");
										}
										else
										{
											print(arr5(arr1(arr,arr[b])));
										}
										//System.out.println("3");
										break loop;
									}else
									{
										System.out.println("impossible");
										break loop;
									}
								}
							}
						}
						if(d>=10)
						{
							int sum1=0;
							lqq:for(int b=arr.length-1;b>0;b--)
							{
								for(int v=b-1;v>=0;v--)
								{
									sum1=arr[b]+arr[v];
									if(sum1%3==sum)
									{
										if(arr[b]!=5&&arr[v]!=5)
										{
											if(qiuhe(arr5(arr1(arr1(arr,arr[b]),arr[v])))==0)
											{
												System.out.println("impossible");
											}
											else
											{
												print(arr5(arr1(arr1(arr,arr[b]),arr[v])));
											}
											//System.out.println("4");
											break lqq;
										}else if((arr[b]==5&&arr[v]!=5)||(arr[b]!=5&&arr[v]==5))
										{
											if(is5>1)
											{
												if(qiuhe(arr5(arr1(arr1(arr,arr[b]),arr[v])))==0)
												{
													System.out.println("impossible");
												}
												else
												{
													print(arr5(arr1(arr1(arr,arr[b]),arr[v])));
												}
												//System.out.println("5");
												break lqq;
											}else
											{
												System.out.println("impossible");
												break lqq;
											}
										}else
										{
											if(is5>2)
											{
												if(qiuhe(arr5(arr1(arr1(arr,arr[b]),arr[v])))==0)
												{
													System.out.println("impossible");
												}
												else
												{
													print(arr5(arr1(arr1(arr,arr[b]),arr[v])));
												}
												//System.out.println("6");
												break lqq;
											}else
											{
												System.out.println("impossible");
												break lqq;
											}
										}
									}
								}
								if(b-1<0)
								{
									System.out.println("impossible");
								}
							}
						}
					}
				}
			}
		}
	}
	public static void daopai(int[] arr)
	{
		Arrays.sort(arr);
		for(int a=0;a<arr.length/2;a++)
		{
			int temp=arr[a];
			arr[a]=arr[arr.length-1-a];
			arr[arr.length-1-a]=temp;
		}
	}
	public static void print(int[] arr)
	{
		for(int x:arr)
		{
			System.out.print(x);
		}
		System.out.println();
	}
	public static int[] arr1(int[] arr,int n)
	{
		int[] arr1=new int[arr.length-1];
		int count=0;
		int b=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]!=n||count!=0)
			{
				arr1[b]=arr[a];
				b++;
			}
			if(arr[a]==n)
			{
				count++;
			}
		}
		return arr1;
	}
	public static int[] arr5(int[] arr)
	{
		int[] arr1=new int[arr.length];
		int count=0;
		int b=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]!=5||count!=0)
			{
				arr1[b]=arr[a];
				b++;
			}
			if(arr[a]==5)
			{
				count++;
			}
		}
		arr1[arr.length-1]=5;
		return arr1;
	}
	public static int qiuhe(int[] arr)
	{
		int sum=0;
		for(int a=0;a<arr.length;a++)
		{
			sum+=arr[a];
		}
		return sum;
	}
}
