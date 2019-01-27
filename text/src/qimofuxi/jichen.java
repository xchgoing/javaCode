package qimofuxi;

import java.util.Arrays;
import java.util.Scanner;

public class jichen
{
      public static void main(String[] args)
      {
    	  String s="";
          Scanner scan=new Scanner(System.in);
          s=scan.next();//从键盘获取下一个字符串
          int point=s.indexOf(".");//找到第一个.的位置
          String filetype=s.substring(point,s.length());
          System.out.println(filetype);
      }
      
}
