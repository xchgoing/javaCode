package qimofuxi;

import java.util.Arrays;
import java.util.Scanner;

public class jichen
{
      public static void main(String[] args)
      {
    	  String s="";
          Scanner scan=new Scanner(System.in);
          s=scan.next();//�Ӽ��̻�ȡ��һ���ַ���
          int point=s.indexOf(".");//�ҵ���һ��.��λ��
          String filetype=s.substring(point,s.length());
          System.out.println(filetype);
      }
      
}
