package ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class txet4 extends JFrame implements ActionListener
{
	JLabel lbla=new JLabel("������뾶��");
	JLabel lblb=new JLabel("���Ϊ:");
	JLabel lble=new JLabel();
	JTextField txta=new JTextField(10);
	JButton btna=new JButton("�����ҿ�ʼ�������");
	JButton btnexit=new JButton("������˳�");
	public txet4()
	{
		this.setTitle("Բ�����������");
		Container con=this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lbla);
		con.add(txta);
		con.add(lblb);
		con.add(lble);
		con.add(btna);
		con.add(btnexit);
		btna.addActionListener(this);
		btnexit.addActionListener(this);
		this.setBounds(600, 100,400,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		try 
		{
			if(e.getSource()==btna)
			{
				double t=Double.valueOf(txta.getText());
				double pi=3.1415926;
				double s=pi*(t*t);
				lble.setText(String.valueOf(s));
			}
			else if(e.getSource()==btnexit)
			{
				System.exit(0);
			}
		}
		catch(Exception ex)
		{
			lble.setText("�������󣡣�");
			txta.setText("");
		}
	}
	public static void main(String[] args)
	{
		txet4 test=new txet4();
		
	}
}
