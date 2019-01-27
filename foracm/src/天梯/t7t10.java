package ÌìÌÝ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class t7t10
{
	static int[] arrh;
	static int[] arrz;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			arrh=new int[n];
			arrz=new int[n];
			for(int a=0;a<n;a++)
			{
				arrh[a]=s.nextInt();
			}
			for(int a=0;a<n;a++)
			{
				arrz[a]=s.nextInt();
			}
			node root=next(0,n-1,0,n-1);
			out(root);
		}
	}
	
	public static class node
	{
		node left;
		int root;
		node right;
		public node(int q)
		{
			root=q;
			left=null;
			right=null;
		}
	}
	
	public static node next(int hs,int ho,int zs,int zo)
	{
		if(ho-hs<0)return null;
		if(hs==ho)return new node(arrh[ho]);
		node r=new node(arrh[ho]);
		int rootw=0;
		for(int a=zs;a<=zo;a++)
		{
			if(arrh[ho]==arrz[a])
			{
				rootw=a;
				break;
			}
		}
		r.left=next(hs,hs+rootw-1-zs,zs,rootw-1);
		r.right=next(hs+rootw-zs,ho-1,rootw+1,zo);
		return r;
	}
	public static void out(node n)
	{
		int count=0;
		Queue<node> q=new LinkedList<>();
		if(n!=null)
		q.add(n);
		while(!q.isEmpty())
		{
			if(q.peek().left!=null)
			q.add(q.peek().left);
			if(q.peek().right!=null)
			q.add(q.peek().right);
			if(count++>0)
			System.out.print(" ");
			System.out.print(q.poll().root);
		}
	
	}
}
