package sf;  
  
import java.util.Scanner;  
  
/** 
 * @author Vashon 
 * date:20150410 
 *  
 * ��Ŀ����ŵ���㷨(������������<<C���Գ���̳�>>�ķ���˼·��ͨ���ع���ɡ�) 
 *  
 * �ݹ����(����Ȥ�Ŀ���ȥ�о��ǵݹ��)���ƶ�n����Ƭ��a��c�������Ƚ�n-1����Ƭ��a����c�ƶ���b���ƶ�n-1��������ͬ������ģ��С. 
 * 1.��n-1����Ƭ��a����c�ƶ���b 
 * 2.����n����Ƭ�ƶ���c 
 * 3.�ٽ�n-1����Ƭ��b����a�ƶ���c 
 */  
public class hannuota {  
    public static void main(String args[]){  
        System.out.println("������Ҫ�ƶ��Ŀ�����");  
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();  
        move(n,'a','b','c');  
    }  
    public static void move(int n,char a,char b,char c){  
        if(n==1){ //��nֻ��1����ʱ��ֱ�Ӵ�a�ƶ���c  
            System.out.println(a+"-->"+c);  
        }else{  
            move(n-1,a,c,b);  
            System.out.println(a+"-->"+c);  
            move(n-1,b,a,c);//��n-1���ƶ�����֮��b�俪ʼ�̣�bͨ��a�ƶ���c  
        }  
    }  
} 