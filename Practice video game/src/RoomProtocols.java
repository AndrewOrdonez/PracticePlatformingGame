import java.util.ArrayList;

public class RoomProtocols {
	

	public static void runRoom() {
		// TODO Auto-generated method stub
		switch(Runner.currentRoom.getRoomNum()){
		case 0:run0();break;
		case 1:run1();break;
		case 2:run2();break;
		}
	}
	public static void run1(){
		 if (DrawPanel.y<=300&&DrawPanel.x<200&&Runner.l){
	    		if(DrawPanel.x<11){
	    			DrawPanel.x=11;
	    		}
	    		Runner.gravity(300);
	    	}
	    	  if((DrawPanel.x>=200||(!Runner.l))){
	    		 if (DrawPanel.y>300){
	    			 Runner.l=false;
	    		 }
	    		 if (DrawPanel.x<-9){
	    			 Runner.setNewRoom(-1);
	    			 Runner.setSpawn(Runner.currentRoom, 0);
	    		 }
	    		 else if(DrawPanel.x>1000){
	    			 Runner.setNewRoom(1);
	    			 Runner.setSpawn(Runner.currentRoom, 0);
	    		 }
	    	Runner.gravity(450);
	    	}
	}	
	
	public static void run0(){
		if(DrawPanel.x<11){
			DrawPanel.x=11;
		}
	
		 else if(DrawPanel.x>1000){
			 Runner.setNewRoom(1);
			 Runner.setSpawn(Runner.currentRoom, 0);
		 }
	Runner.gravity(450);
	}	
	
	public static void run2(){
		
	
		  if(DrawPanel.x<-10){
			 Runner.setNewRoom(-1);
			 Runner.setSpawn(Runner.currentRoom, 1);
		 }
	Runner.gravity(450);
	}
	
//Big ass list of rooms:
	static ArrayList<Room> roomList=new ArrayList<Room>();
	
}
