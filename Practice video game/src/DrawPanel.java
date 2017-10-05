import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public DrawPanel(){
	super();
	setBackground(Color.black);
	//setBackground(new Color(210, 230, 255));
}
static int x=20;
static int y=1;
public void paintComponent(Graphics g){
	super.paintComponent(g);
	int ngh=10;
	if(Runner.down){ngh=5;}
	//green
//	g.setColor(new Color(80,170,100));
	g.setColor(Color.cyan);
	g.fillRect(x, y-ngh, 10, ngh);
	g.setColor(Color.LIGHT_GRAY);
	g.drawString("DeathToll:  "+Runner.dt, 870, 50);
	switch(Runner.currentRoom.getRoomNum()){
		case 0:
			g.setColor(new Color(200,170,10));
			g.drawLine(10, 450, 1000, 450);
			g.drawLine(10, 450, 8, 0);
			break;
		case 1:    
			//orange
//			g.setColor(new Color(200,170,10));
			//pink
			//g.setColor(new Color(255,105,180));
			g.setColor(Color.GREEN);

			g.drawLine(0, 450, 1000, 450);  
			g.drawLine(10, 300, 200, 300);
			g.drawLine(10, 300, 9, 0);
			break;
		case 2:
//			g.setColor(new Color(200,170,10));
			g.setColor(Color.GREEN);
			g.drawLine(0, 450, 300, 450);
			g.drawLine(300, 450, 750, 150);
			g.drawLine(750, 150, 1000, 150);
			break;
		case 3:
			g.setColor(Color.GREEN);
			g.drawLine(0, 150, 300, 150);
			g.drawLine(350, 150, 1000, 150);
	}
 
}

}
