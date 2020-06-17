
import javax.swing.*;
import java.awt.*;
import java.util.*;

class DrawCircle extends JComponent{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(200,50,200,200);
		g.drawString("(radius:100)", 500, 300);
	}
}
class DrawPolygon extends JComponent{
	static int angle=2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		String str="angle : "+ angle;
		g.drawString(str, 500, 300+10*(angle-2));
		Polygon p=new Polygon();
		for(int i=0;i<angle;i++)
			p.addPoint((int)Math.round(100*Math.acos(Math.toRadians(360/angle*i)))+300,(int)Math.round(100*Math.asin(Math.toRadians(360/angle*i)))+150);
		g.drawPolygon(p);
	}
}

public class grsphic {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<3||num>97) {
			System.out.print("잘못된 수 입력입니다.\n");
			return;
		}
		
		final int FRAME_W=600;
		final int FRAME_H=400;
		
		f.setSize(FRAME_W,FRAME_H);
		f.setTitle("Archimedes");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		DrawCircle c=new DrawCircle();
		c.setBounds(0,0,FRAME_W,FRAME_H);
		f.getContentPane().add(c);
		
		DrawPolygon dp=new DrawPolygon();
		dp.setBounds(0,0,FRAME_W,FRAME_H);
		f.getContentPane().add(dp);
		
		f.setVisible(true);
		for(int i=0;i<=num-3;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			DrawPolygon.angle++;
			dp.repaint();
		}
		
		
	}
}
