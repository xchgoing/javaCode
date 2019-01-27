package ����;

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
		public Node(int value)//���캯���� ����ֵ���У��ӽڵ㹹������ֵ
		{
			this.value=value;
			left=null;
			right=null;
		}
	}
	public static Node BBT(int[] h,int[] z,int hs,int he,int zs,int ze)//����������������飬�������飬����ʼ��ֵ�����������ֵ������ʼ��ֵ�����������ֵ
	{
		if(hs>he)return null;                                         //���  ����ʼ��ֵ>���������ֵ
		if(hs==he)return new Node(h[he]);							  //���  ����ʼ��ֵ=���������ֵ     ���ӽڵ�
		Node n=new Node(h[he]);                                       //new һ��node value�Ǻ�������Ľ���ֵ���������ʱ�ĸ��ڵ㣩
		int flag=0;													  //int ��flag
		for(int i=zs;i<=ze;i++)										  //forѭ�� �����������
		if(z[i]==h[he])												  //�ҳ������е� ����λ��
		{
			flag=i;                                                   //flag�����������еĸ����±�
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