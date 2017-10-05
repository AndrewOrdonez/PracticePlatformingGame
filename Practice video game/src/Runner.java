import javax.swing.*;
public class Runner {
	static DrawPanel panel = new DrawPanel();      
	static KeyListen h=new KeyListen();
	static JFrame application = new JFrame();  
	static boolean j;
	public static void gravity(int lh){
   	 if(grav<=3){
   		grav+=.7001;
   		DrawPanel.y+=grav;
   	}

   	 if(grav>0){
   	 if (DrawPanel.y<lh){
   		grav*=1.05;
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
    		DrawPanel.x-=2;
    	}
    	if (right){
    		DrawPanel.x+=2;
    	}
    	if (j&&grav==4){
    		grav=-12;
    		DrawPanel.y+=grav;
    		j=false;

    	}
	}
	public static void setNewRoom(int roomMovement){
		prevRoom=currentRoom;
		currentRoom=RoomProtocols.roomList.get(currentRoom.getRoomNum()+roomMovement);
	}
	public static void setSpawn(Room r,int n){
		DrawPanel.x=r.getSpawnX(n);
		DrawPanel.y=r.getSpawnY(n);
	}
	static Room currentRoom=new Room(0, 0);
	static Room prevRoom=currentRoom;
	static double grav=1;
	static boolean l=true;
	static int dt=0;
	static boolean left, right, down=false;
	public static void main(String[] args) throws InterruptedException
	{
        //code for making frame 
	    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    application.setSize(1000, 550);  
	    application.add(panel);     
	    application.addKeyListener(h);
	    application.setVisible(true);
	    currentRoom=new Room(1,3);
	   
	  //code for adding rooms
	    RoomProtocols.roomList.add(new Room(0,1));
	    RoomProtocols.roomList.get(0).setSpawn(0, 980, 450);
	    RoomProtocols.roomList.add(new Room(1,2));
	    RoomProtocols.roomList.get(1).setSpawn(0, 10, 450);
	    RoomProtocols.roomList.get(1).setSpawn(1, 980, 450);
	    RoomProtocols.roomList.add(new Room(2,2));
	    RoomProtocols.roomList.get(2).setSpawn(0, 10, 450);
	    RoomProtocols.roomList.get(2).setSpawn(1, 980, 150);
	    RoomProtocols.roomList.add(new Room(3,2));
	    RoomProtocols.roomList.get(3).setSpawn(0, 10, 150);
	    RoomProtocols.roomList.get(3).setSpawn(1, 980, 150);
	    
	    //code for work:
	    while (true){
	    	
	    control();
	    RoomProtocols.runRoom();
	    
	    	panel.repaint();
			application.add(panel,0);
			application.getComponent(0).setVisible(true);
			Thread.sleep(10);

	    }
	    
	 }
}
