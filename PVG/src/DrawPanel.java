
import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public DrawPanel(){
	super();
	setBackground(Color.BLACK);
	//setBackground(new Color(210, 230, 255));
}
static int x=20;
static int y=1;
public void paintComponent(Graphics g){
	super.paintComponent(g);
	int ngh=10;
	if(Runner.down){ngh=5;}
	g.setColor(new Color(80,170,100));
	g.fillRect(x, y-ngh, 10, ngh);
	switch(Runner.currentRoom.getRoomNum()){
		case 0:
			g.setColor(new Color(200,170,10));
			g.drawLine(10, 450, 1000, 450);
			g.drawLine(10, 450, 8, 0);
			break;
		case 1:    
			g.setColor(new Color(200,170,10));
			g.drawLine(0, 450, 1000, 450);  
			g.drawLine(10, 300, 200, 300);
			g.drawLine(10, 300, 9, 0);
			break;
		case 2:
			g.setColor(new Color(200,170,10));
			g.drawLine(0, 450, 500, 450);
			break;
		case 3:
			g.setColor(new Color(50,160,150));
			g.drawLine(0, 420, 1000, 420);
			break;
		case 4:
			g.setColor(new Color(50,160,150));
			g.drawLine(0, 420, 500, 420);
			g.drawLine(500, 400, 1000, 400);
			g.drawLine(500, 420, 500, 400);
			break;
		case 5:
			g.setColor(new Color(50,160,150));
			g.drawLine(200, 420, 1000, 420);
			g.drawLine(200, 420, 202, 0);
		
	}
 
}

}