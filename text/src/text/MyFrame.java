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
	public MyJDialog(MyFrame frame)//ʵ����һ��JDialog�ര�壬ָ���Ի���ĸ����壬������⣬������
	{
		super(frame,"��һ��JDiajog�ര��",true);
		Container container=getContentPane();
		container.add(new JLabel("����һ���Ի���"));
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
		JLabel jl=new JLabel("����һ������");
		//����ǩ���������ڱ�ǩ�м�λ��
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("�����Ի���");
		bl.setBounds(100, 100, 100, 210);
		//setVisible(true);
		bl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				//ʹ����ɼ�
				new MyJDialog(MyFrame.this).setVisible(true);
			}

		});
		container.add(bl);
		setVisible(true);
	}
	
}
