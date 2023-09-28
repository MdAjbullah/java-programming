import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CalcFrame extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6;
	Font fnt;
	CalcFrame(String s)
	{
		super(s);
		c=getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(null);
		fnt=new Font("Elephant",Font.BOLD,18);

		l1=new JLabel("Enter First No:");
		l1.setBounds(50,100,180,50);
		l1.setFont(fnt);
		c.add(l1);

		l2=new JLabel("Enter Second No:");
		l2.setBounds(50,160,180,50);
		l2.setFont(fnt);
		c.add(l2);

		l3=new JLabel("Your Result:");
		l3.setBounds(50,220,180,50);
		l3.setFont(fnt);
		c.add(l3);

		t1=new JTextField();
		t1.setBounds(250,100,200,50);
		t1.setFont(fnt);
		c.add(t1);

		t2=new JTextField();
		t2.setBounds(250,160,200,50);
		t2.setFont(fnt);
		c.add(t2);

		t3=new JTextField();
		t3.setBounds(250,220,200,50);
		t3.setFont(fnt);
		c.add(t3);

		b1=new JButton("SUM");
		b1.setBounds(60,300,100,50);
		b1.setFont(fnt);
		c.add(b1);

		b2=new JButton("SUB");
		b2.setBounds(150,300,100,50);
		b2.setFont(fnt);
		c.add(b2);

		b3=new JButton("MUL");
		b3.setBounds(240,300,100,50);
		b3.setFont(fnt);
		c.add(b3);

		b4=new JButton("DIV");
		b4.setBounds(330,300,100,50);
		b4.setFont(fnt);
		c.add(b4);

		b5=new JButton("MOD");
		b5.setBounds(420,300,100,50);
		b5.setFont(fnt);
		c.add(b5);

		b6=new JButton("EXIT");
		b6.setBounds(510,300,100,50);
		b6.setFont(fnt);
		c.add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x,y;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		if(ae.getSource()==b1)
		{
			int r=x+y;
			t3.setText(String.valueOf(r));
		}
		else if(ae.getSource()==b2)
		{
			int r=x-y;
			t3.setText(String.valueOf(r));

		}
		else if(ae.getSource()==b3)
		{
			int r=x*y;
			t3.setText(String.valueOf(r));

		}

		else if(ae.getSource()==b4)
		{
			int r=x/y;
			t3.setText(String.valueOf(r));

		}

		else if(ae.getSource()==b5)
		{
			int r=x%y;
			t3.setText(String.valueOf(r));

		}
		else if(ae.getSource()==b6)
		{
			
				System.exit(0);

		}


	}
}
class SimpleCalc
{
	public static void main(String[] args) {
		CalcFrame frm=new CalcFrame("Simple Calc");
		frm.setSize(700,600);
		frm.show();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}