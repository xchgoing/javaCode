package zuoye;

import java.util.Scanner;
public class fdf
{
 public static void main(String []args)
 {
  Scanner input=new Scanner(System.in);
   try
   {
    while(true)
    {
     System.out.println("�������г̾��루���:");
     double m=input.nextDouble();
     double price=0.0;
      if(m<=2)
      {
       price=6.0;
      }
      else if(m>2)
      {
       price=6+(m-2)*5;
      }
      System.out.println("�۸�"+price); 
      System.out.println("�Ƿ����?(y/n)");
      String answer=input.next();
      if("n".equals(answer))
      {
       break;
      }
    }
   }
   catch(Exception ex)
   {
    System.out.println("��������Ч����!");
    String s=input.next();
   }
 }
}
