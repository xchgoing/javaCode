package text;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class MyJDialog extends JDialog
{
	public MyJDialog(MyFrame frame)//实例化一个JDialog类窗体，指定对话框的父窗体，窗体标题，和类型
	{
		super(frame,"第一个JDiajog类窗体",true);
		Container container=getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(330,330,100,100);
	}
}
public class MyFrame extends JFrame
{
	public static void main(String args[])
	{
		new MyFrame();
	}
	public MyFrame()
	{
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个窗体");
		//将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("弹出对话框");
		bl.setBounds(100, 100, 100, 210);
		//setVisible(true);
		bl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				//使窗体可见
				new MyJDialog(MyFrame.this).setVisible(true);
			}

		});
		container.add(bl);
		setVisible(true);
	}
	
}
