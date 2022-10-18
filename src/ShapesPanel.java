import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class ShapesPanel extends JPanel{
	
		private int x = 0;
		private int y = 0;
		private int color =100;

		public void moveRec() {
			x = x + 1;
			y = y + 1;
		}
		
		protected void movers(Graphics g, int cx, int cy, int cz) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(5));

			if(x>=40 && x<=280) {
				g2d.drawRect(40+x,150,25,20);
				g2d.setColor(Color.ORANGE);
				g2d.fillRect(40+x, 150, 25, 20);

				
				g2d.setColor(Color.GREEN);
				g2d.fillRect(x+10, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				g2d.setColor(Color.MAGENTA);
				g2d.fillRect(-40+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(-80+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				
				
				g2d.setColor(Color.RED);
				g2d.fillRect(-120+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				g2d.setColor(Color.PINK);
				g2d.fillRect(-160+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				g2d.setColor(Color.CYAN);
				g2d.fillRect(-200+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
				
				g2d.setColor(Color.BLUE);
				g2d.fillRect(-240+x, 150, 25, 20);
				g2d.drawRect(x,150,25,20);
			}
			
		

		 if(x>=310 && x<=410) {
				g2d.setColor(new Color(0, 0, 0, 128));
				g2d.fillRect(40+x, 120, 10, 80);
				
				g2d.setColor(Color.GREEN);
				g2d.fillRect(50+x, 120, 10, 80);
				
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(60+x, 120, 10, 80);

			} if(x>=410 && x<=420) {
				//g2d.drawRect(460, 135, 30, 50);
				g2d.fillRect(460, 135, 30, 50);
				
//				//g2d.drawRect(460, 135, 30, 50);
//				g2d.setColor(Color.GREEN);
//				g2d.fillRect(460, 135, 30, 50);
				
			}
			//rec moving throw the end of the cable.
			 if(x>=420 && x<=630) {
				//g2d.drawRect(490,150,25,20);
				g2d.fillRect(80+x,150,25,20);
				
				
				//g2d.drawRect(490,150,25,20);
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(120+x,150,25,20);
				
				g2d.setColor(Color.GREEN);
				g2d.fillRect(160+x,150,25,20);
				
			}
			 

			
			
			
			
			
	
		}
		
		//what it takes by the method and what the method return type.
		protected void draw(Graphics g, int cx, int cy, int cz) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(5));
			
			//start cable
			g2d.setColor(Color.BLACK);
			g2d.drawRect(40,150,310,20);
			
			//queue
			g2d.setColor(Color.BLACK);
			int loop =0;
			while(loop <=100) {
				g2d.drawRect(350+loop, 120, 10, 80);
				loop += 10;

			}

			
			
			//out of queue
			g2d.drawRect(460, 135, 30, 50);
			
			//end cable
			g2d.drawRect(490,150,250,20);
			
			//draw the rect moving at the end of the cable.
			g2d.setColor(Color.BLACK);
			Rectangle2D.Double cableWidth = new Rectangle2D.Double(350,150,50,20);
			
			movers(g,cx,cy,cz);
			//movers(g,cx,cy,cz);
	

			
		}
		
		
		
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			//calling draw method.
			draw(g,0,0,0);

		}
		

}


//for(int i =0; i< 10;i++) {
//for(int j =0; j< 10;j++) {
//	g2d.drawRect(350+loop, 120, 10, 80);
//	loop += 10;
//}
//loop+=0;
//}

//g2d.drawRect(350, 120, 10, 80);
//g2d.drawRect(360, 120, 10, 80);
//g2d.drawRect(370, 120, 10, 80);
//g2d.drawRect(380, 120, 10, 80);
//g2d.drawRect(390, 120, 10, 80);
//g2d.drawRect(400, 120, 10, 80);
//g2d.drawRect(410, 120, 10, 80);
//g2d.drawRect(420, 120, 10, 80);
//g2d.drawRect(430, 120, 10, 80);
//g2d.drawRect(440, 120, 10, 80);
//g2d.drawRect(450, 120, 10, 80);
