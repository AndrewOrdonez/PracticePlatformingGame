import javax.swing.*;
public class Runner {
	static DrawPanel panel = new DrawPanel();      
	static KeyListen h=new KeyListen();
	static JFrame application = new JFrame();  
	static boolean j;
	public static void gravity(int lh){
   	 if(grav<=3){
   		grav+=1.0001;
   		DrawPanel.y+=grav;
   	}

   	 if(grav>0){
   	 if (DrawPanel.y<lh){
   		grav*=1.08;
   		DrawPanel.y+=grav;
   	}
   	if (DrawPanel.y>=lh){
   		grav=4;
   		DrawPanel.y=lh;
   	}
   	}
	}
	public static void control(){
		if (left){
    		DrawPanel.x-=3;
    	}
    	if (right){
    		DrawPanel.x+=3;
    	}
    	if (j&&grav==4){
    		grav=-14;
    		DrawPanel.y+=grav;
    		j=false;

    	}
	}
	static double grav=1;
	static boolean left, right, down=false;
	public static void main(String[] args) throws InterruptedException
	{
                
	    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    application.setSize(1000, 550);  
	    application.add(panel);     
	    application.addKeyListener(h);
	    application.setVisible(true);
	    
	    boolean l=true;
	    //change the below into a gravity method, so you can make more rooms
	    //it should include stuff for making levels
	    //or don't, it might get confusing
	    while (true){
	    	
	    control();

	    	 if (DrawPanel.y<300&&DrawPanel.x<200&&l){
	    		gravity(300);
	    	}
	    	  if((DrawPanel.x>=200||(!l))){
	    		 if (DrawPanel.y>300){
	    			 l=false;
	    		 }
	    	gravity(449);
	    	}
	    	panel.repaint();
			application.add(panel,0);
			application.getComponent(0).setVisible(true);
			Thread.sleep(15);

	    }
	    
	 }
}
