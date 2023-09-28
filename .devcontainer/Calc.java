import java.awt.*;
import java.awt.event.*;

public class Calc implements ActionListener{

JFrame frame;
JTextField textfield;
JButton[] numberButtons = new JButton[10];
JButton[] functionButtons = new JButton[8];
JButton addButton,subButton,mulButton,divButton;
JButton decButton, equButton, delButton, clrButton;
JPanel panel;


Font myFont=new Font("Ink Free",Font.BOLD,30);

	double num1=0,num2=0,result=0;
	char operator;


   Calc();
 {

		frm=new JFrame("calculator");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(420,550);
		frm.setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for(int i =0;i<8;i++){
        	functionButtons[i].addActionListener(this);
        	functionButtons[i].setFont(myFont);
        	functionButtons[i].setFocusable(false);
        }

        for(int i =0;i<10;i++){
        	numberButtons[i] = new jButton(String.valueof(i));
        	numberButtons[i].addActionListener(this);
        	numberButtons[i].setFont(myFont);
        	numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
       
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        

        frame.add(panel);
        fram.add(delButton);
        fram.add(clrButton);
        frame.add(textfield);
		frm.setVisible(true);

	}
	public static void main(String[] args) {
		
		calculator calc=new calculator();
	}
		public void actionPerformed(ActionEvent e){

		}
	}