import java.applet.*;
import java.awt.*;
import java.util.*;
public class Scroll extends Applet implements Runnable
{
	
	int x,y;
	Font fnt;
	public void init()
	{
		x=10;
		y=200;
		fnt=new Font("Elephant",Font.BOLD,30);
		Thread t=new Thread(this);
		t.start();
	} 
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x,y,100,100);
		Calendar
		c=Calendar.getInstance();
		/*
		int d,m,y;
		d=c.get(Calendar.DATE);
		m=c.get(Calendar.MONTH);
        y=c.get(Calendar.YEAR);
        System.out.println(d+"/"+(m+1)+"/"+y);
         */
        int h,min,s,x;
        h=c.get(Calendar.HOUR);
        min=c.get(Calendar.MINUTE);
        s=c.get(Calendar.SECOND);
        x=c.get(Calendar.AM_PM);
        if(x==0)
        {
        	g.drawString(h+":"+min+":"+s+" "+"AM",250,150);
        }
        else
        {
        	g.drawString(h+":"+min+":"+s+" "+"PM",250,150);
        }

	}
	public void run()
	{
		while(true)
		{
			x=x+1;
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{

			}
			if(x==500)
				x=1;
			repaint();
		}
	}
}
/*
<applet code="Scroll" width=800 height=600>
</applet> 
*/