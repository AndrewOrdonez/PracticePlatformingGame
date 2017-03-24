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
    g.setColor(new Color(200,170,10));
    g.drawLine(0, 450, 1000, 450);  
    g.drawLine(0, 300, 200, 300);
    g.setColor(new Color(80,170,100));
    int ngh=10;
    if(Runner.down){ngh=5;}
    g.fillRect(x, y-ngh, 10, ngh);
}

}
