package studybymyself;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class jframe extends JFrame
{
	public jframe()
	{
		JFrame jf=new JFrame();
		jf.setSize(200,200);
		jf.setTitle("窗体");
		jf.setVisible(true);
		jf.setBackground(Color.BLUE);
		Container con=jf.getContentPane();
		JLabel jl=new JLabel("一个标签");
		jl.setBounds(20,20, 20, 20);
		con.add(jl);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		jframe temp=new jframe();
	}

}
