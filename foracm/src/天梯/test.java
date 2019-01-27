package 天梯;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {

	public static void main(String[] args) 
	{
		int[] arr={};
		System.out.println(arr[2]);
	}
	public static class Node
	{
		int value;
		Node left;
		Node right;
		public Node(int value)//构造函数中 根的值会有，子节点构造是无值
		{
			this.value=value;
			left=null;
			right=null;
		}
	}
	public static Node BBT(int[] h,int[] z,int hs,int he,int zs,int ze)//传入参数：后序数组，中序数组，后序开始的值，后序结束的值，中序开始的值，中序结束的值
	{
		if(hs>he)return null;                                         //如果  后序开始的值>后序结束的值
		if(hs==he)return new Node(h[he]);							  //如果  后序开始的值=后序结束的值     无子节点
		Node n=new Node(h[he]);                                       //new 一个node value是后序遍历的结束值（后序遍历时的根节点）
		int flag=0;													  //int 出flag
		for(int i=zs;i<=ze;i++)										  //for循环 遍历中序遍历
		if(z[i]==h[he])												  //找出中序中的 根的位置
		{
			flag=i;                                                   //flag存放中序遍历中的根的下标
			break;
		}
		n.left= BBT(h,z,hs,hs+flag-1-zs,zs,flag-1);			
		n.right=BBT(h,z,hs+flag-zs,he-1,flag+1,ze);
		return n;
	
	}
	public static void PT_FL(Node n)
	{
		int count=0;
		Queue<Node> q=new LinkedList<>();
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
			System.out.print(q.poll().value);
		}
	
	}
	public static void PT_PR(Node n)
	{
		if(n==null)return;
		System.out.print(n.value+" ");
		PT_PR(n.left);
		PT_PR(n.right);
	}

}