import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;


public class baidufarm extends JFrame
{
	public baidufarm()
	{
		this.setTitle("chuangti");
		this.setBounds(300,200,580,600);
		this.setSize(580,600);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		/*JButton button=new JButton(" 按钮");
		add(button);
		//button.addActionListener(--star);
		this.setLayout(new FlowLayout());
		this.setBounds(500, 130, 200, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	}

	public static void main(String[] args)
	{
		new baidufarm();
		/*JButton button=new JButton(" 按钮");
		add(button);
		//button.addActionListener(--按钮具体处罚的事件);
		this.setLayout(new FlowLayout());
		this.setBounds(500, 130, 200, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int sum=1;
			int n=0;
			n=s.nextInt();
			if(n<=1||n>=30)
			{
				break;
			}
			for(int a=1;a<n;a++)
			{
				sum=(sum+1)*2;
			}
			System.out.println(sum);
		}

	}

}
